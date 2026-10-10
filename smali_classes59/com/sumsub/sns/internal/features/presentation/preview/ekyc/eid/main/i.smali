.class public final Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;
.super Lcom/sumsub/sns/core/presentation/base/I;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sumsub/sns/core/presentation/base/I<",
        "Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T0;",
        "Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;",
        "Lcom/sumsub/sns/core/presentation/base/I;",
        "Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T0;",
        "Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;",
        "<init>",
        "()V",
        "com/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/a",
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
        "SMAP\nSNSEidMainFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSEidMainFragment.kt\ncom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/SNSEidMainFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 CommonExtensions.kt\ncom/sumsub/sns/internal/core/common/CommonExtensionsKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,537:1\n106#2,15:538\n500#3:553\n298#4,2:554\n256#4,2:556\n256#4,2:558\n256#4,2:560\n256#4,2:562\n256#4,2:564\n*S KotlinDebug\n*F\n+ 1 SNSEidMainFragment.kt\ncom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/SNSEidMainFragment\n*L\n47#1:538,15\n136#1:553\n225#1:554,2\n270#1:556,2\n278#1:558,2\n350#1:560,2\n352#1:562,2\n471#1:564,2\n*E\n"
    }
.end annotation


# static fields
.field public static final k:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/a;

.field public static final synthetic l:[Lkotlin/reflect/KProperty;


# instance fields
.field public final a:Lkotlin/Lazy;

.field public final b:Ljava/lang/String;

.field public final c:Lcom/sumsub/sns/internal/core/common/L;

.field public final d:Lcom/sumsub/sns/internal/core/common/L;

.field public final e:Lcom/sumsub/sns/internal/core/common/L;

.field public final f:Lcom/sumsub/sns/internal/core/presentation/nfc/b;

.field public g:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T0;

.field public h:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/m;

.field public i:Z

.field public j:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/j;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;

    .line 3
    .line 4
    const-string v1, "content"

    .line 5
    .line 6
    const-string v2, "getContent()Landroid/view/ViewGroup;"

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
    const-string/jumbo v2, "toolbarView"

    .line 15
    .line 16
    const-string v4, "getToolbarView()Lcom/sumsub/sns/core/widget/SNSToolbarView;"

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v2, v4, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 20
    move-result-object v2

    .line 21
    .line 22
    const-string v4, "bottomSheet"

    .line 23
    .line 24
    const-string v5, "getBottomSheet()Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;"

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v4, v5, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 28
    move-result-object v0

    .line 29
    const/4 v4, 0x3

    .line 30
    .line 31
    new-array v4, v4, [Lkotlin/reflect/KProperty;

    .line 32
    .line 33
    aput-object v1, v4, v3

    .line 34
    const/4 v1, 0x1

    .line 35
    .line 36
    aput-object v2, v4, v1

    .line 37
    const/4 v1, 0x2

    .line 38
    .line 39
    aput-object v0, v4, v1

    .line 40
    .line 41
    sput-object v4, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->l:[Lkotlin/reflect/KProperty;

    .line 42
    .line 43
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/a;

    .line 44
    .line 45
    .line 46
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/a;-><init>()V

    .line 47
    .line 48
    sput-object v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->k:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/a;

    .line 49
    return-void
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
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/b1;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/b1;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;)V

    .line 9
    .line 10
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/d;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/d;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;)V

    .line 14
    .line 15
    sget-object v2, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 16
    .line 17
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/e;

    .line 18
    .line 19
    .line 20
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/e;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/d;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v2, v3}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/f;

    .line 33
    .line 34
    .line 35
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/f;-><init>(Lkotlin/Lazy;)V

    .line 36
    .line 37
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/g;

    .line 38
    .line 39
    .line 40
    invoke-direct {v4, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/g;-><init>(Lkotlin/Lazy;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p0, v2, v3, v4, v0}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->a:Lkotlin/Lazy;

    .line 47
    .line 48
    const-string v0, "E_KYC"

    .line 49
    .line 50
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->b:Ljava/lang/String;

    .line 51
    .line 52
    sget v0, Lcom/sumsub/sns/R$id;->sns_content:I

    .line 53
    .line 54
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 55
    .line 56
    .line 57
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 58
    .line 59
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->c:Lcom/sumsub/sns/internal/core/common/L;

    .line 60
    .line 61
    sget v0, Lcom/sumsub/sns/R$id;->sns_toolbar:I

    .line 62
    .line 63
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 64
    .line 65
    .line 66
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 67
    .line 68
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->d:Lcom/sumsub/sns/internal/core/common/L;

    .line 69
    .line 70
    sget v0, Lcom/sumsub/sns/R$id;->sns_eid_bottom_sheet:I

    .line 71
    .line 72
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 73
    .line 74
    .line 75
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 76
    .line 77
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->e:Lcom/sumsub/sns/internal/core/common/L;

    .line 78
    .line 79
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/nfc/b;

    .line 80
    .line 81
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/b;

    .line 82
    .line 83
    .line 84
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/b;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;)V

    .line 85
    .line 86
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/c;

    .line 87
    .line 88
    .line 89
    invoke-direct {v2, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/c;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;)V

    .line 90
    .line 91
    .line 92
    invoke-direct {v0, p0, v1, v2}, Lcom/sumsub/sns/internal/core/presentation/nfc/b;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/b;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/c;)V

    .line 93
    .line 94
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->f:Lcom/sumsub/sns/internal/core/presentation/nfc/b;

    .line 95
    return-void
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

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;)Lkotlin/Unit;
    .locals 7

    .line 317
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->f()Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;->hide()V

    .line 318
    :cond_0
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object v1

    .line 319
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->a:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;

    .line 320
    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->b(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;)Lcom/sumsub/sns/internal/core/analytics/Screen;

    move-result-object v2

    .line 321
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->b:Ljava/lang/String;

    .line 322
    sget-object v4, Lcom/sumsub/sns/internal/core/analytics/Control;->DismissButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    const/4 v5, 0x0

    const/16 v6, 0x18

    .line 323
    invoke-static/range {v1 .. v6}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;I)V

    .line 324
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/N0;)Lkotlin/Unit;
    .locals 6

    .line 172
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object v0

    .line 173
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->a:Lkotlin/Lazy;

    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;

    .line 174
    invoke-static {v1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->b(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;)Lcom/sumsub/sns/internal/core/analytics/Screen;

    move-result-object v1

    .line 175
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->b:Ljava/lang/String;

    .line 176
    sget-object v3, Lcom/sumsub/sns/internal/core/analytics/Control;->ContinueButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    const/4 v4, 0x0

    const/16 v5, 0x18

    .line 177
    invoke-static/range {v0 .. v5}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;I)V

    .line 178
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->a:Lkotlin/Lazy;

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;

    .line 179
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/N0;->f:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T;

    .line 180
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T;)V

    .line 181
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/O0;)Lkotlin/Unit;
    .locals 6

    .line 141
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object v0

    .line 142
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->a:Lkotlin/Lazy;

    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;

    .line 143
    invoke-static {v1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->b(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;)Lcom/sumsub/sns/internal/core/analytics/Screen;

    move-result-object v1

    .line 144
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->b:Ljava/lang/String;

    .line 145
    sget-object v3, Lcom/sumsub/sns/internal/core/analytics/Control;->InfoButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    const/4 v4, 0x0

    const/16 v5, 0x18

    .line 146
    invoke-static/range {v0 .. v5}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;I)V

    .line 147
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->a:Lkotlin/Lazy;

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;

    .line 148
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/N;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/N;

    .line 149
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T;)V

    .line 150
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/Q0;)Lkotlin/Unit;
    .locals 6

    .line 270
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object v0

    .line 271
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->a:Lkotlin/Lazy;

    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;

    .line 272
    invoke-static {v1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->b(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;)Lcom/sumsub/sns/internal/core/analytics/Screen;

    move-result-object v1

    .line 273
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->b:Ljava/lang/String;

    .line 274
    sget-object v3, Lcom/sumsub/sns/internal/core/analytics/Control;->InfoButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    const/4 v4, 0x0

    const/16 v5, 0x18

    .line 275
    invoke-static/range {v0 .. v5}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;I)V

    .line 276
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->a:Lkotlin/Lazy;

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;

    .line 277
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/P;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/P;

    .line 278
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T;)V

    .line 279
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/R0;)Lkotlin/Unit;
    .locals 6

    .line 235
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object v0

    .line 236
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->a:Lkotlin/Lazy;

    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;

    .line 237
    invoke-static {v1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->b(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;)Lcom/sumsub/sns/internal/core/analytics/Screen;

    move-result-object v1

    .line 238
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->b:Ljava/lang/String;

    .line 239
    sget-object v3, Lcom/sumsub/sns/internal/core/analytics/Control;->CancelButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    const/4 v4, 0x0

    const/16 v5, 0x18

    .line 240
    invoke-static/range {v0 .. v5}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;I)V

    .line 241
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->a:Lkotlin/Lazy;

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;

    .line 242
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/R0;->g:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T;

    .line 243
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T;)V

    .line 244
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/S0;)Lkotlin/Unit;
    .locals 6

    .line 199
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object v0

    .line 200
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->a:Lkotlin/Lazy;

    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;

    .line 201
    invoke-static {v1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->b(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;)Lcom/sumsub/sns/internal/core/analytics/Screen;

    move-result-object v1

    .line 202
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->b:Ljava/lang/String;

    .line 203
    sget-object v3, Lcom/sumsub/sns/internal/core/analytics/Control;->ContinueButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    const/4 v4, 0x0

    const/16 v5, 0x18

    .line 204
    invoke-static/range {v0 .. v5}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;I)V

    .line 205
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->a:Lkotlin/Lazy;

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;

    .line 206
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/S0;->f:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T;

    .line 207
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T;)V

    .line 208
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 12

    .line 38
    sget-object p1, Lcom/sumsub/sns/core/presentation/base/l;->Companion:Lcom/sumsub/sns/core/presentation/base/h;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2}, Lcom/sumsub/sns/core/presentation/base/h;->a(Landroid/os/Bundle;)Z

    move-result p1

    if-eqz p1, :cond_10

    .line 39
    const-string p1, "DOCUMENT_RESULT"

    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/m;

    if-nez p1, :cond_0

    goto/16 :goto_9

    .line 40
    :cond_0
    iget-object p2, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/m;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/k;

    .line 41
    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/f;

    if-eqz v0, :cond_1

    .line 42
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->a:Lkotlin/Lazy;

    .line 43
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;

    .line 44
    iget-object p2, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/m;->b:Ljava/lang/String;

    .line 45
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/m;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/k;

    .line 46
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/f;

    .line 47
    iget-boolean p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/f;->a:Z

    .line 48
    invoke-virtual {p0, p2, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->a(Ljava/lang/String;Z)V

    return-void

    .line 49
    :cond_1
    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/b;

    if-eqz v0, :cond_2

    .line 50
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->a:Lkotlin/Lazy;

    .line 51
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;

    .line 52
    iget-object p2, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/m;->b:Ljava/lang/String;

    .line 53
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/m;->d:Ljava/lang/String;

    .line 54
    invoke-virtual {p0, p2, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 55
    :cond_2
    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/j;

    const-string v1, "SNSEidMain"

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-nez v0, :cond_8

    .line 56
    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/d;

    if-eqz v0, :cond_3

    goto/16 :goto_3

    .line 57
    :cond_3
    instance-of p2, p2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/h;

    if-eqz p2, :cond_7

    .line 58
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->a:Lkotlin/Lazy;

    .line 59
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;

    .line 60
    iget-object p0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/m;->b:Ljava/lang/String;

    .line 61
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    sget-object p1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 63
    iget-object p2, p1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 64
    const-string v0, "On puk entered"

    invoke-virtual {p2, v1, v0, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    if-eqz p0, :cond_6

    .line 65
    invoke-static {p0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_4

    goto :goto_2

    .line 66
    :cond_4
    iget-object p1, v4, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->g:Lkotlinx/coroutines/flow/n;

    invoke-interface {p1, v3}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 67
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/l0;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/l0;

    invoke-virtual {v4, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->b(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/o0;)V

    .line 68
    :try_start_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 69
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p2

    if-ge v2, p2, :cond_5

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result p2

    .line 70
    invoke-static {p2}, Lkotlin/text/CharsKt;->digitToInt(C)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    .line 71
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catch_0
    move-exception v0

    move-object p0, v0

    move-object v5, p0

    goto :goto_1

    .line 72
    :cond_5
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toIntArray(Ljava/util/Collection;)[I

    move-result-object p0

    new-instance p1, Lde/authada/library/api/unblock/Puk;

    invoke-direct {p1, p0}, Lde/authada/library/api/unblock/Puk;-><init>([I)V

    .line 73
    new-instance p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/f;

    iget-object p2, v4, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->n:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/D0;

    iget-object v0, v4, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->o:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, p1, p2, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/f;-><init>(Lde/authada/library/api/unblock/Puk;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/D0;Lkotlin/jvm/functions/Function1;)V

    .line 74
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/k;

    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/k;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/h;)V

    invoke-virtual {v4, p1}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    const/4 v8, 0x4

    const/4 v9, 0x0

    .line 75
    const-string v6, "E_KYC"

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/sumsub/sns/core/presentation/base/C;->throwError$default(Lcom/sumsub/sns/core/presentation/base/C;Ljava/lang/Throwable;Ljava/lang/String;Landroid/os/Parcelable;ILjava/lang/Object;)V

    goto/16 :goto_9

    .line 76
    :cond_6
    :goto_2
    iget-object p0, p1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 77
    const-string p1, "PUK is null or blank"

    invoke-virtual {p0, v1, p1, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    .line 78
    :cond_7
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    .line 79
    :cond_8
    :goto_3
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->a:Lkotlin/Lazy;

    .line 80
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;

    .line 81
    iget-object p0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/m;->c:Ljava/lang/String;

    .line 82
    iget-object p2, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/m;->b:Ljava/lang/String;

    .line 83
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/m;->d:Ljava/lang/String;

    .line 84
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/m;->e:Ljava/lang/String;

    .line 85
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    sget-object v5, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 87
    iget-object v5, v5, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 88
    const-string v6, "On pin change ready"

    invoke-virtual {v5, v1, v6, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    if-eqz p0, :cond_11

    .line 89
    invoke-static {p0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_9

    goto/16 :goto_9

    :cond_9
    if-eqz p2, :cond_11

    invoke-static {p2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_a

    goto/16 :goto_9

    .line 90
    :cond_a
    invoke-virtual {v4, v2}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->c(Z)V

    .line 91
    iget-object v1, v4, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->g:Lkotlinx/coroutines/flow/n;

    invoke-interface {v1, v3}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 92
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/f0;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/f0;

    invoke-virtual {v4, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->b(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/o0;)V

    .line 93
    :try_start_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    invoke-direct {v1, v5}, Ljava/util/ArrayList;-><init>(I)V

    move v5, v2

    .line 94
    :goto_4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v6

    if-ge v5, v6, :cond_b

    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v6

    .line 95
    invoke-static {v6}, Lkotlin/text/CharsKt;->digitToInt(C)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    .line 96
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :catch_1
    move-exception v0

    move-object p0, v0

    move-object v5, p0

    goto/16 :goto_8

    .line 97
    :cond_b
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toIntArray(Ljava/util/Collection;)[I

    move-result-object p0

    new-instance v6, Lde/authada/library/api/pinChanger/TPin;

    invoke-direct {v6, p0}, Lde/authada/library/api/pinChanger/TPin;-><init>([I)V

    .line 98
    new-instance p0, Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    invoke-direct {p0, v1}, Ljava/util/ArrayList;-><init>(I)V

    move v1, v2

    .line 99
    :goto_5
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v1, v5, :cond_c

    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v5

    .line 100
    invoke-static {v5}, Lkotlin/text/CharsKt;->digitToInt(C)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 101
    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    .line 102
    :cond_c
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->toIntArray(Ljava/util/Collection;)[I

    move-result-object p0

    new-instance v7, Lde/authada/library/api/authentication/Pin;

    invoke-direct {v7, p0}, Lde/authada/library/api/authentication/Pin;-><init>([I)V

    if-eqz v0, :cond_e

    .line 103
    new-instance p0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p2

    invoke-direct {p0, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 104
    :goto_6
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p2

    if-ge v2, p2, :cond_d

    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result p2

    .line 105
    invoke-static {p2}, Lkotlin/text/CharsKt;->digitToInt(C)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    .line 106
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    .line 107
    :cond_d
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->toIntArray(Ljava/util/Collection;)[I

    move-result-object p0

    new-instance p2, Lde/authada/library/api/Can;

    invoke-direct {p2, p0}, Lde/authada/library/api/Can;-><init>([I)V

    move-object v8, p2

    goto :goto_7

    :cond_e
    move-object v8, v3

    :goto_7
    if-eqz p1, :cond_f

    .line 108
    invoke-static {p1}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    :cond_f
    move-object v9, v3

    .line 109
    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/e;

    .line 110
    iget-object v10, v4, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->m:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/B0;

    .line 111
    iget-object v11, v4, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->o:Lkotlin/jvm/functions/Function1;

    .line 112
    invoke-direct/range {v5 .. v11}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/e;-><init>(Lde/authada/library/api/pinChanger/TPin;Lde/authada/library/api/authentication/Pin;Lde/authada/library/api/Can;Ljava/lang/Integer;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/B0;Lkotlin/jvm/functions/Function1;)V

    .line 113
    new-instance p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/k;

    invoke-direct {p0, v5}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/k;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/h;)V

    invoke-virtual {v4, p0}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :goto_8
    const/4 v8, 0x4

    const/4 v9, 0x0

    .line 114
    const-string v6, "E_KYC"

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/sumsub/sns/core/presentation/base/C;->throwError$default(Lcom/sumsub/sns/core/presentation/base/C;Ljava/lang/Throwable;Ljava/lang/String;Landroid/os/Parcelable;ILjava/lang/Object;)V

    goto :goto_9

    .line 115
    :cond_10
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->g:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T0;

    instance-of p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/Q0;

    if-nez p1, :cond_11

    .line 116
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->a:Lkotlin/Lazy;

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;

    .line 117
    sget-object p1, Lcom/sumsub/sns/internal/core/common/u;->b:Lcom/sumsub/sns/internal/core/common/u;

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->a(Lcom/sumsub/sns/internal/core/common/w;)Z

    :cond_11
    :goto_9
    return-void
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;)Lkotlin/Unit;
    .locals 7

    .line 15
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->f()Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;->hide()V

    .line 16
    :cond_0
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object v1

    .line 17
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->a:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;

    .line 18
    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->b(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;)Lcom/sumsub/sns/internal/core/analytics/Screen;

    move-result-object v2

    .line 19
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->b:Ljava/lang/String;

    .line 20
    sget-object v4, Lcom/sumsub/sns/internal/core/analytics/Control;->DismissButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    const/4 v5, 0x0

    const/16 v6, 0x18

    .line 21
    invoke-static/range {v1 .. v6}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;I)V

    .line 22
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/O0;)Lkotlin/Unit;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->a:Lkotlin/Lazy;

    .line 2
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;

    .line 3
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/O0;->f:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/J;

    .line 4
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/Q0;)Lkotlin/Unit;
    .locals 6

    .line 5
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object v0

    .line 6
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->a:Lkotlin/Lazy;

    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;

    .line 7
    invoke-static {v1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->b(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;)Lcom/sumsub/sns/internal/core/analytics/Screen;

    move-result-object v1

    .line 8
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->b:Ljava/lang/String;

    .line 9
    sget-object v3, Lcom/sumsub/sns/internal/core/analytics/Control;->EidProceedToIdentButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    const/4 v4, 0x0

    const/16 v5, 0x18

    .line 10
    invoke-static/range {v0 .. v5}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;I)V

    .line 11
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->a:Lkotlin/Lazy;

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/D;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/D;

    .line 13
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T;)V

    .line 14
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final c(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 3

    .line 1
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/X;

    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getServiceLocator$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/domain/h;

    move-result-object v1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v2

    invoke-direct {v0, p0, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/X;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;Lcom/sumsub/sns/internal/core/domain/h;Landroid/os/Bundle;)V

    return-object v0
.end method

.method public static final c(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/Q0;)Lkotlin/Unit;
    .locals 6

    .line 2
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->a:Lkotlin/Lazy;

    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;

    .line 4
    invoke-static {v1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->b(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;)Lcom/sumsub/sns/internal/core/analytics/Screen;

    move-result-object v1

    .line 5
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->b:Ljava/lang/String;

    .line 6
    sget-object v3, Lcom/sumsub/sns/internal/core/analytics/Control;->EidChangeTransportPinButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    const/4 v4, 0x0

    const/16 v5, 0x18

    .line 7
    invoke-static/range {v0 .. v5}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;I)V

    .line 8
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->a:Lkotlin/Lazy;

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;

    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/x;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/x;

    .line 10
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T;)V

    .line 11
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T0;I)Landroid/view/ViewGroup;
    .locals 1

    .line 280
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->g:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T0;

    if-eqz v0, :cond_1

    .line 281
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 282
    :cond_0
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->g()Landroid/view/ViewGroup;

    move-result-object p1

    return-object p1

    .line 283
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->g()Landroid/view/ViewGroup;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 284
    :cond_2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->g()Landroid/view/ViewGroup;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 285
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->g()Landroid/view/ViewGroup;

    move-result-object p1

    return-object p1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/N0;)V
    .locals 5

    .line 151
    sget v0, Lcom/sumsub/sns/R$layout;->sns_eid_info:I

    invoke-virtual {p0, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T0;I)Landroid/view/ViewGroup;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 152
    sget v2, Lcom/sumsub/sns/R$id;->sns_title:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    if-eqz v0, :cond_1

    .line 153
    sget v3, Lcom/sumsub/sns/R$id;->sns_subtitle:I

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    goto :goto_1

    :cond_1
    move-object v3, v1

    :goto_1
    if-eqz v0, :cond_2

    .line 154
    sget v4, Lcom/sumsub/sns/R$id;->sns_continue:I

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/Button;

    goto :goto_2

    :cond_2
    move-object v4, v1

    :goto_2
    if-eqz v0, :cond_3

    .line 155
    sget v1, Lcom/sumsub/sns/R$id;->sns_image:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/widget/ImageView;

    :cond_3
    if-eqz v2, :cond_4

    .line 156
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/N0;->b:Ljava/lang/String;

    .line 157
    invoke-static {v2, v0}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_4
    if-eqz v3, :cond_5

    .line 158
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/N0;->c:Ljava/lang/String;

    .line 159
    invoke-static {v3, v0}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_5
    if-eqz v4, :cond_6

    .line 160
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/N0;->d:Ljava/lang/String;

    .line 161
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 162
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i1;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i1;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/N0;)V

    invoke-static {v0, v4}, Lcom/sumsub/sns/internal/core/common/k;->a(Lkotlin/jvm/functions/Function0;Landroid/view/View;)V

    .line 163
    :cond_6
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/N0;->e:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSEidIcons;

    if-eqz v0, :cond_8

    if-eqz v1, :cond_7

    const/4 v0, 0x0

    .line 164
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_7
    if-eqz v1, :cond_9

    .line 165
    sget-object v0, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    move-result-object v0

    .line 166
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v2

    .line 167
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/N0;->e:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSEidIcons;

    .line 168
    invoke-virtual {p1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSEidIcons;->getImageName()Ljava/lang/String;

    move-result-object p1

    .line 169
    invoke-interface {v0, v2, p1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 170
    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_8
    if-eqz v1, :cond_9

    const/16 p1, 0x8

    .line 171
    invoke-virtual {v1, p1}, Landroid/view/View;->setVisibility(I)V

    :cond_9
    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/O0;)V
    .locals 9

    .line 118
    sget v0, Lcom/sumsub/sns/R$layout;->sns_eid_pin_selector:I

    invoke-virtual {p0, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T0;I)Landroid/view/ViewGroup;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 119
    sget v2, Lcom/sumsub/sns/R$id;->sns_title:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    if-eqz v0, :cond_1

    .line 120
    sget v3, Lcom/sumsub/sns/R$id;->sns_subtitle:I

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    goto :goto_1

    :cond_1
    move-object v3, v1

    :goto_1
    if-eqz v0, :cond_2

    .line 121
    sget v4, Lcom/sumsub/sns/R$id;->sns_button_option:I

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/Button;

    goto :goto_2

    :cond_2
    move-object v4, v1

    :goto_2
    if-eqz v0, :cond_3

    .line 122
    sget v5, Lcom/sumsub/sns/R$id;->sns_primary_button:I

    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/Button;

    goto :goto_3

    :cond_3
    move-object v5, v1

    :goto_3
    if-eqz v0, :cond_4

    .line 123
    sget v6, Lcom/sumsub/sns/R$id;->sns_secondary_button:I

    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/Button;

    goto :goto_4

    :cond_4
    move-object v6, v1

    :goto_4
    if-eqz v0, :cond_5

    .line 124
    sget v1, Lcom/sumsub/sns/R$id;->sns_image:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/widget/ImageView;

    :cond_5
    if-eqz v1, :cond_6

    .line 125
    sget-object v0, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    move-result-object v0

    .line 126
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v7

    .line 127
    sget-object v8, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSEidIcons;->PIN:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSEidIcons;

    invoke-virtual {v8}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSEidIcons;->getImageName()Ljava/lang/String;

    move-result-object v8

    .line 128
    invoke-interface {v0, v7, v8}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 129
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_6
    if-eqz v2, :cond_7

    .line 130
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/O0;->b:Ljava/lang/CharSequence;

    .line 131
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_7
    if-eqz v3, :cond_8

    .line 132
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/O0;->c:Ljava/lang/CharSequence;

    .line 133
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_8
    if-eqz v6, :cond_9

    const/16 v0, 0x8

    .line 134
    invoke-virtual {v6, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_9
    if-eqz v4, :cond_a

    .line 135
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/O0;->d:Ljava/lang/CharSequence;

    .line 136
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 137
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/x0;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/x0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/O0;)V

    invoke-static {v0, v4}, Lcom/sumsub/sns/internal/core/common/k;->a(Lkotlin/jvm/functions/Function0;Landroid/view/View;)V

    :cond_a
    if-eqz v5, :cond_b

    .line 138
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/O0;->e:Ljava/lang/CharSequence;

    .line 139
    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 140
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/y0;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/y0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/O0;)V

    invoke-static {v0, v5}, Lcom/sumsub/sns/internal/core/common/k;->a(Lkotlin/jvm/functions/Function0;Landroid/view/View;)V

    :cond_b
    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/Q0;)V
    .locals 8

    .line 245
    sget v0, Lcom/sumsub/sns/R$layout;->sns_eid_pin_selector:I

    invoke-virtual {p0, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T0;I)Landroid/view/ViewGroup;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 246
    sget v2, Lcom/sumsub/sns/R$id;->sns_title:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    if-eqz v0, :cond_1

    .line 247
    sget v3, Lcom/sumsub/sns/R$id;->sns_subtitle:I

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    goto :goto_1

    :cond_1
    move-object v3, v1

    :goto_1
    if-eqz v0, :cond_2

    .line 248
    sget v4, Lcom/sumsub/sns/R$id;->sns_button_option:I

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/Button;

    goto :goto_2

    :cond_2
    move-object v4, v1

    :goto_2
    if-eqz v0, :cond_3

    .line 249
    sget v5, Lcom/sumsub/sns/R$id;->sns_primary_button:I

    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/Button;

    goto :goto_3

    :cond_3
    move-object v5, v1

    :goto_3
    if-eqz v0, :cond_4

    .line 250
    sget v6, Lcom/sumsub/sns/R$id;->sns_secondary_button:I

    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/Button;

    goto :goto_4

    :cond_4
    move-object v6, v1

    :goto_4
    if-eqz v0, :cond_5

    .line 251
    sget v7, Lcom/sumsub/sns/R$id;->sns_image:I

    invoke-virtual {v0, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    goto :goto_5

    :cond_5
    move-object v0, v1

    :goto_5
    if-eqz v2, :cond_6

    .line 252
    iget-object v7, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/Q0;->b:Ljava/lang/CharSequence;

    .line 253
    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_6
    if-eqz v3, :cond_8

    .line 254
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/Q0;->c:Ljava/lang/CharSequence;

    if-eqz v2, :cond_7

    .line 255
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object v1

    :cond_7
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_8
    if-eqz v4, :cond_9

    .line 256
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/Q0;->d:Ljava/lang/CharSequence;

    .line 257
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 258
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/f1;

    invoke-direct {v1, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/f1;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/Q0;)V

    invoke-static {v1, v4}, Lcom/sumsub/sns/internal/core/common/k;->a(Lkotlin/jvm/functions/Function0;Landroid/view/View;)V

    :cond_9
    if-eqz v5, :cond_a

    .line 259
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/Q0;->e:Ljava/lang/CharSequence;

    .line 260
    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 261
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/g1;

    invoke-direct {v1, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/g1;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/Q0;)V

    invoke-static {v1, v5}, Lcom/sumsub/sns/internal/core/common/k;->a(Lkotlin/jvm/functions/Function0;Landroid/view/View;)V

    :cond_a
    if-eqz v6, :cond_b

    .line 262
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/Q0;->f:Ljava/lang/CharSequence;

    .line 263
    invoke-virtual {v6, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 264
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/h1;

    invoke-direct {v1, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/h1;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/Q0;)V

    invoke-static {v1, v6}, Lcom/sumsub/sns/internal/core/common/k;->a(Lkotlin/jvm/functions/Function0;Landroid/view/View;)V

    :cond_b
    if-eqz v0, :cond_c

    .line 265
    sget-object p1, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    move-result-object p1

    .line 266
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v1

    .line 267
    sget-object v2, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSEidIcons;->ID_CARD:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSEidIcons;

    invoke-virtual {v2}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSEidIcons;->getImageName()Ljava/lang/String;

    move-result-object v2

    .line 268
    invoke-interface {p1, v1, v2}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 269
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_c
    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/R0;)V
    .locals 8

    .line 209
    sget v0, Lcom/sumsub/sns/R$layout;->sns_eid_scanning:I

    invoke-virtual {p0, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T0;I)Landroid/view/ViewGroup;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 210
    sget v2, Lcom/sumsub/sns/R$id;->sns_title:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    if-eqz v0, :cond_1

    .line 211
    sget v3, Lcom/sumsub/sns/R$id;->sns_subtitle:I

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    goto :goto_1

    :cond_1
    move-object v3, v1

    :goto_1
    if-eqz v0, :cond_2

    .line 212
    sget v4, Lcom/sumsub/sns/R$id;->sns_status:I

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    goto :goto_2

    :cond_2
    move-object v4, v1

    :goto_2
    if-eqz v0, :cond_3

    .line 213
    sget v5, Lcom/sumsub/sns/R$id;->sns_instructions:I

    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Lcom/airbnb/lottie/LottieAnimationView;

    goto :goto_3

    :cond_3
    move-object v5, v1

    :goto_3
    if-eqz v0, :cond_4

    .line 214
    sget v6, Lcom/sumsub/sns/R$id;->sns_reading_progress:I

    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/core/widget/SNSDotsProgressView;

    goto :goto_4

    :cond_4
    move-object v0, v1

    .line 215
    :goto_4
    iget-object v6, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->g:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T0;

    if-eqz v6, :cond_5

    .line 216
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_9

    .line 217
    :cond_5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object v6

    if-eqz v6, :cond_6

    sget v1, Lcom/sumsub/sns/R$id;->sns_button:I

    invoke-virtual {v6, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    :cond_6
    if-eqz v1, :cond_7

    .line 218
    iget-object v6, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/R0;->f:Ljava/lang/CharSequence;

    .line 219
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 220
    new-instance v6, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/e1;

    invoke-direct {v6, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/e1;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/R0;)V

    invoke-static {v6, v1}, Lcom/sumsub/sns/internal/core/common/k;->a(Lkotlin/jvm/functions/Function0;Landroid/view/View;)V

    :cond_7
    if-eqz v5, :cond_9

    .line 221
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/R0;->h:Ljava/lang/CharSequence;

    .line 222
    iget-object v6, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/R0;->i:Ljava/lang/CharSequence;

    if-eqz v1, :cond_8

    .line 223
    const-string v7, "Chip area"

    invoke-static {v5, v7, v1}, Lcom/sumsub/sns/internal/core/common/X;->a(Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/String;Ljava/lang/CharSequence;)V

    :cond_8
    if-eqz v6, :cond_9

    .line 224
    const-string v1, "Phone sensor"

    invoke-static {v5, v1, v6}, Lcom/sumsub/sns/internal/core/common/X;->a(Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/String;Ljava/lang/CharSequence;)V

    :cond_9
    if-eqz v2, :cond_a

    .line 225
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/R0;->b:Ljava/lang/CharSequence;

    .line 226
    invoke-static {v2, v1}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_a
    if-eqz v3, :cond_b

    .line 227
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/R0;->c:Ljava/lang/CharSequence;

    .line 228
    invoke-static {v3, v1}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_b
    if-eqz v4, :cond_c

    .line 229
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/R0;->d:Ljava/lang/CharSequence;

    .line 230
    invoke-static {v4, v1}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 231
    :cond_c
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/R0;->e:Ljava/lang/Integer;

    if-eqz p1, :cond_e

    if-eqz v0, :cond_d

    .line 232
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/sumsub/sns/core/widget/SNSDotsProgressView;->setProgress(I)V

    :cond_d
    if-eqz v0, :cond_f

    const/4 p1, 0x0

    .line 233
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_e
    if-eqz v0, :cond_f

    const/16 p1, 0x8

    .line 234
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    :cond_f
    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/S0;)V
    .locals 7

    .line 182
    sget v0, Lcom/sumsub/sns/R$layout;->sns_eid_status:I

    invoke-virtual {p0, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T0;I)Landroid/view/ViewGroup;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 183
    sget v2, Lcom/sumsub/sns/R$id;->sns_title:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    if-eqz v0, :cond_1

    .line 184
    sget v3, Lcom/sumsub/sns/R$id;->sns_subtitle:I

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    goto :goto_1

    :cond_1
    move-object v3, v1

    :goto_1
    if-eqz v0, :cond_2

    .line 185
    sget v4, Lcom/sumsub/sns/R$id;->sns_button:I

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/Button;

    goto :goto_2

    :cond_2
    move-object v4, v1

    :goto_2
    if-eqz v0, :cond_3

    .line 186
    sget v1, Lcom/sumsub/sns/R$id;->sns_status:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/widget/ImageView;

    .line 187
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v1, :cond_4

    .line 188
    sget-object v0, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->PROCESSING:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    invoke-static {v1, v0}, Lcom/sumsub/sns/core/widget/SNSStepViewExtensionsKt;->setSnsStepState(Landroid/view/View;Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;)V

    .line 189
    :cond_4
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/S0;->d:Ljava/lang/String;

    if-eqz v0, :cond_5

    if-eqz v1, :cond_5

    .line 190
    sget-object v5, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {v5}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    move-result-object v5

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v6

    invoke-interface {v5, v6, v0}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 191
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_5
    if-eqz v2, :cond_6

    .line 192
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/S0;->b:Ljava/lang/CharSequence;

    .line 193
    invoke-static {v2, v0}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_6
    if-eqz v3, :cond_7

    .line 194
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/S0;->c:Ljava/lang/CharSequence;

    .line 195
    invoke-static {v3, v0}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_7
    if-eqz v4, :cond_8

    .line 196
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/S0;->e:Ljava/lang/CharSequence;

    .line 197
    invoke-static {v4, v0}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 198
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/d1;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/d1;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/S0;)V

    invoke-static {v0, v4}, Lcom/sumsub/sns/internal/core/common/k;->a(Lkotlin/jvm/functions/Function0;Landroid/view/View;)V

    :cond_8
    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T0;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->d:Lcom/sumsub/sns/internal/core/common/L;

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->l:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/core/widget/SNSToolbarView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/core/widget/SNSToolbarView;->setOptionButtonVisible(Z)V

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->g()Landroid/view/ViewGroup;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v1, 0x4

    .line 4
    filled-new-array {v1}, [I

    move-result-object v1

    invoke-static {v0, v1}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/view/ViewGroup;[I)V

    .line 5
    :cond_1
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/N0;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/N0;

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/N0;)V

    goto :goto_0

    .line 6
    :cond_2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/R0;

    if-eqz v0, :cond_4

    .line 7
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->g:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T0;

    instance-of v0, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/R0;

    if-eqz v0, :cond_3

    .line 8
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->g()Landroid/view/ViewGroup;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getLayoutTransition()Landroid/animation/LayoutTransition;

    move-result-object v0

    if-eqz v0, :cond_3

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/animation/LayoutTransition;->setDuration(J)V

    .line 9
    :cond_3
    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/R0;

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/R0;)V

    goto :goto_0

    .line 10
    :cond_4
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/S0;

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/S0;

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/S0;)V

    goto :goto_0

    .line 11
    :cond_5
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/Q0;

    if-eqz v0, :cond_6

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/Q0;

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/Q0;)V

    goto :goto_0

    .line 12
    :cond_6
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/O0;

    if-eqz v0, :cond_7

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/O0;

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/O0;)V

    goto :goto_0

    .line 13
    :cond_7
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/P0;

    if-eqz v0, :cond_c

    .line 14
    :goto_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->j:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/j;

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    .line 15
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/j;->a:Lcom/sumsub/sns/internal/core/analytics/Screen;

    goto :goto_1

    :cond_8
    move-object v2, v1

    .line 16
    :goto_1
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T0;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/j;

    if-eqz v3, :cond_9

    .line 17
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/j;->a:Lcom/sumsub/sns/internal/core/analytics/Screen;

    goto :goto_2

    :cond_9
    move-object v3, v1

    :goto_2
    if-eq v2, v3, :cond_b

    if-eqz v0, :cond_a

    .line 18
    sget-object v4, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 19
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/j;->a:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 20
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/j;->b:Ljava/util/Map;

    .line 21
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Screen closed "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x4

    const/4 v9, 0x0

    const-string v5, "SNSEidMainFragment"

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->i$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 22
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T0;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/j;

    if-eqz v0, :cond_a

    .line 23
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/j;->a:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 24
    iget-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/j;->b:Ljava/util/Map;

    .line 25
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Screen changed "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 26
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 27
    iget-object v3, v3, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 28
    const-string v4, "SNSEidMainFragment"

    invoke-virtual {v3, v4, v2, v1}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 29
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object v1

    .line 30
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/j;->a:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 31
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->b:Ljava/lang/String;

    .line 32
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/j;->b:Ljava/util/Map;

    const/16 v4, 0x8

    .line 33
    invoke-static {v1, v2, v3, v0, v4}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Ljava/util/Map;I)V

    .line 34
    :cond_a
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T0;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/j;

    .line 35
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->j:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/j;

    .line 36
    :cond_b
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->g:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T0;

    return-void

    .line 37
    :cond_c
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/U;)V
    .locals 5

    .line 301
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->f()Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget v2, Lcom/sumsub/sns/R$layout;->sns_eid_pin_bottom_sheet:I

    invoke-virtual {v0, v2}, Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;->inflate(I)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    .line 302
    sget v2, Lcom/sumsub/sns/R$id;->sns_button:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    goto :goto_1

    :cond_1
    move-object v2, v1

    :goto_1
    if-eqz v0, :cond_2

    .line 303
    sget v3, Lcom/sumsub/sns/R$id;->sns_title:I

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    goto :goto_2

    :cond_2
    move-object v3, v1

    :goto_2
    if-eqz v0, :cond_3

    .line 304
    sget v4, Lcom/sumsub/sns/R$id;->sns_text:I

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    goto :goto_3

    :cond_3
    move-object v0, v1

    :goto_3
    if-eqz v3, :cond_4

    .line 305
    iget-object v4, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/U;->a:Ljava/lang/CharSequence;

    .line 306
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_4
    if-eqz v0, :cond_5

    .line 307
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/U;->b:Ljava/lang/CharSequence;

    .line 308
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_5
    if-eqz v2, :cond_6

    .line 309
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/U;->c:Ljava/lang/CharSequence;

    .line 310
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_6
    if-eqz v2, :cond_7

    .line 311
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/a1;

    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/a1;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;)V

    invoke-static {p1, v2}, Lcom/sumsub/sns/internal/core/common/k;->a(Lkotlin/jvm/functions/Function0;Landroid/view/View;)V

    .line 312
    :cond_7
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->f()Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;->show()V

    .line 313
    :cond_8
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object p1

    .line 314
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/Screen;->EidServiceInfo:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 315
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->b:Ljava/lang/String;

    const/16 v3, 0xc

    .line 316
    invoke-static {p1, v0, v2, v1, v3}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Ljava/util/Map;I)V

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/W;)V
    .locals 5

    .line 286
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->f()Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget v2, Lcom/sumsub/sns/R$layout;->sns_eid_pin_bottom_sheet:I

    invoke-virtual {v0, v2}, Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;->inflate(I)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    .line 287
    sget v2, Lcom/sumsub/sns/R$id;->sns_button:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    goto :goto_1

    :cond_1
    move-object v2, v1

    :goto_1
    if-eqz v0, :cond_2

    .line 288
    sget v3, Lcom/sumsub/sns/R$id;->sns_title:I

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    goto :goto_2

    :cond_2
    move-object v3, v1

    :goto_2
    if-eqz v0, :cond_3

    .line 289
    sget v4, Lcom/sumsub/sns/R$id;->sns_text:I

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    goto :goto_3

    :cond_3
    move-object v0, v1

    :goto_3
    if-eqz v3, :cond_4

    const/16 v4, 0x8

    .line 290
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    :cond_4
    if-eqz v0, :cond_6

    .line 291
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/W;->a:Ljava/lang/CharSequence;

    if-eqz v3, :cond_5

    .line 292
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object v3

    goto :goto_4

    :cond_5
    move-object v3, v1

    :goto_4
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_6
    if-eqz v2, :cond_7

    .line 293
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/W;->b:Ljava/lang/CharSequence;

    .line 294
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_7
    if-eqz v2, :cond_8

    .line 295
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/w0;

    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/w0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;)V

    invoke-static {p1, v2}, Lcom/sumsub/sns/internal/core/common/k;->a(Lkotlin/jvm/functions/Function0;Landroid/view/View;)V

    .line 296
    :cond_8
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->f()Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;->show()V

    .line 297
    :cond_9
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object p1

    .line 298
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/Screen;->EidPinInfo:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 299
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->b:Ljava/lang/String;

    const/16 v3, 0xc

    .line 300
    invoke-static {p1, v0, v2, v1, v3}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Ljava/util/Map;I)V

    return-void
.end method

.method public final f()Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->e:Lcom/sumsub/sns/internal/core/common/L;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->l:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x2

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

.method public final g()Landroid/view/ViewGroup;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->c:Lcom/sumsub/sns/internal/core/common/L;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->l:[Lkotlin/reflect/KProperty;

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
    check-cast v0, Landroid/view/ViewGroup;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
.end method

.method public final getClosePayload()Ljava/util/Map;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->f:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 11
    .line 12
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->p:[Lkotlin/reflect/KProperty;

    .line 13
    const/4 v2, 0x1

    .line 14
    .line 15
    aget-object v1, v1, v2

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/o0;

    .line 22
    .line 23
    instance-of v0, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/Z;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    .line 28
    const-string/jumbo v0, "reason"

    .line 29
    .line 30
    const-string v1, "eidCanRequired"

    .line 31
    .line 32
    .line 33
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    .line 37
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    .line 38
    move-result-object v0

    .line 39
    return-object v0

    .line 40
    .line 41
    .line 42
    :cond_0
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 43
    move-result-object v0

    .line 44
    return-object v0
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
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->b:Ljava/lang/String;

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
    sget v0, Lcom/sumsub/sns/R$layout;->sns_fragment_eid:I

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

.method public final getLogTag()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    const-string v0, "SNSEidMainFragment"

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
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->f:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 11
    .line 12
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->p:[Lkotlin/reflect/KProperty;

    .line 13
    const/4 v2, 0x1

    .line 14
    .line 15
    aget-object v1, v1, v2

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/o0;

    .line 22
    .line 23
    instance-of v0, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/Z;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    .line 28
    const-string/jumbo v0, "reason"

    .line 29
    .line 30
    const-string v1, "eidCanRequired"

    .line 31
    .line 32
    .line 33
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    .line 37
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    .line 38
    move-result-object v0

    .line 39
    return-object v0

    .line 40
    .line 41
    .line 42
    :cond_0
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 43
    move-result-object v0

    .line 44
    return-object v0
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

.method public final getScreen()Lcom/sumsub/sns/internal/core/analytics/Screen;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->b(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;)Lcom/sumsub/sns/internal/core/analytics/Screen;

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
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;

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
    .locals 17

    .line 1
    .line 2
    move-object/from16 v1, p0

    .line 3
    .line 4
    move-object/from16 v0, p1

    .line 5
    .line 6
    instance-of v2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/p0;

    .line 7
    const/4 v3, 0x0

    .line 8
    .line 9
    if-eqz v2, :cond_1

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->g()Landroid/view/ViewGroup;

    .line 13
    move-result-object v2

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 19
    .line 20
    :cond_0
    new-instance v2, Landroid/os/Bundle;

    .line 21
    .line 22
    .line 23
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 24
    .line 25
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/p0;

    .line 26
    .line 27
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/p0;->a:Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    const-string/jumbo v4, "result_token"

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v4, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 36
    const/4 v0, 0x0

    .line 37
    const/4 v4, 0x1

    .line 38
    .line 39
    .line 40
    invoke-static {v1, v0, v2, v4, v3}, Lcom/sumsub/sns/core/presentation/base/l;->finishWithResult$idensic_mobile_sdk_aar_defaultRelease$default(Lcom/sumsub/sns/core/presentation/base/l;ILandroid/os/Bundle;ILjava/lang/Object;)V

    .line 41
    return-void

    .line 42
    .line 43
    :cond_1
    instance-of v2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/n;

    .line 44
    .line 45
    .line 46
    const-string/jumbo v4, "request_key_pin"

    .line 47
    .line 48
    .line 49
    const-string/jumbo v5, "pin_mode"

    .line 50
    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/n;

    .line 54
    .line 55
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/n;->a:Ljava/lang/String;

    .line 56
    .line 57
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/n;->b:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/n;->c:Ljava/lang/String;

    .line 60
    .line 61
    sget-object v6, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;->i:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/n;

    .line 62
    .line 63
    new-instance v7, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/d;

    .line 64
    .line 65
    .line 66
    invoke-direct {v7, v2, v3, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;

    .line 72
    .line 73
    .line 74
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;-><init>()V

    .line 75
    .line 76
    new-instance v2, Landroid/os/Bundle;

    .line 77
    .line 78
    .line 79
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v5, v7}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v4}, Lcom/sumsub/sns/core/presentation/base/l;->forResult(Ljava/lang/String;)Lcom/sumsub/sns/core/presentation/base/l;

    .line 89
    move-result-object v2

    .line 90
    const/4 v5, 0x6

    .line 91
    const/4 v6, 0x0

    .line 92
    const/4 v3, 0x0

    .line 93
    const/4 v4, 0x0

    .line 94
    .line 95
    .line 96
    invoke-static/range {v1 .. v6}, Lcom/sumsub/sns/core/presentation/base/l;->navigateTo$idensic_mobile_sdk_aar_defaultRelease$default(Lcom/sumsub/sns/core/presentation/base/l;Landroidx/fragment/app/Fragment;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 97
    return-void

    .line 98
    .line 99
    :cond_2
    instance-of v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/m;

    .line 100
    .line 101
    if-eqz v1, :cond_3

    .line 102
    .line 103
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/m;

    .line 104
    .line 105
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/m;->a:Ljava/lang/String;

    .line 106
    .line 107
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;->i:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/n;

    .line 108
    .line 109
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/b;

    .line 110
    .line 111
    .line 112
    invoke-direct {v2, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/b;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;

    .line 118
    .line 119
    .line 120
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;-><init>()V

    .line 121
    .line 122
    new-instance v1, Landroid/os/Bundle;

    .line 123
    .line 124
    .line 125
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1, v5, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, v4}, Lcom/sumsub/sns/core/presentation/base/l;->forResult(Ljava/lang/String;)Lcom/sumsub/sns/core/presentation/base/l;

    .line 135
    move-result-object v2

    .line 136
    const/4 v5, 0x6

    .line 137
    const/4 v6, 0x0

    .line 138
    const/4 v3, 0x0

    .line 139
    const/4 v4, 0x0

    .line 140
    .line 141
    move-object/from16 v1, p0

    .line 142
    .line 143
    .line 144
    invoke-static/range {v1 .. v6}, Lcom/sumsub/sns/core/presentation/base/l;->navigateTo$idensic_mobile_sdk_aar_defaultRelease$default(Lcom/sumsub/sns/core/presentation/base/l;Landroidx/fragment/app/Fragment;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 145
    return-void

    .line 146
    .line 147
    :cond_3
    instance-of v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/l;

    .line 148
    .line 149
    if-eqz v1, :cond_4

    .line 150
    .line 151
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;->i:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/n;

    .line 152
    .line 153
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/j;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/j;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;

    .line 159
    .line 160
    .line 161
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;-><init>()V

    .line 162
    .line 163
    new-instance v2, Landroid/os/Bundle;

    .line 164
    .line 165
    .line 166
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2, v5, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, v4}, Lcom/sumsub/sns/core/presentation/base/l;->forResult(Ljava/lang/String;)Lcom/sumsub/sns/core/presentation/base/l;

    .line 176
    move-result-object v2

    .line 177
    const/4 v5, 0x6

    .line 178
    const/4 v6, 0x0

    .line 179
    const/4 v3, 0x0

    .line 180
    const/4 v4, 0x0

    .line 181
    .line 182
    move-object/from16 v1, p0

    .line 183
    .line 184
    .line 185
    invoke-static/range {v1 .. v6}, Lcom/sumsub/sns/core/presentation/base/l;->navigateTo$idensic_mobile_sdk_aar_defaultRelease$default(Lcom/sumsub/sns/core/presentation/base/l;Landroidx/fragment/app/Fragment;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 186
    return-void

    .line 187
    .line 188
    :cond_4
    instance-of v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/o;

    .line 189
    .line 190
    if-eqz v1, :cond_5

    .line 191
    .line 192
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/o;

    .line 193
    .line 194
    iget-boolean v0, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/o;->a:Z

    .line 195
    .line 196
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;->i:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/n;

    .line 197
    .line 198
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/f;

    .line 199
    .line 200
    .line 201
    invoke-direct {v2, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/f;-><init>(Z)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;

    .line 207
    .line 208
    .line 209
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;-><init>()V

    .line 210
    .line 211
    new-instance v1, Landroid/os/Bundle;

    .line 212
    .line 213
    .line 214
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v1, v5, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v0, v4}, Lcom/sumsub/sns/core/presentation/base/l;->forResult(Ljava/lang/String;)Lcom/sumsub/sns/core/presentation/base/l;

    .line 224
    move-result-object v2

    .line 225
    const/4 v5, 0x6

    .line 226
    const/4 v6, 0x0

    .line 227
    const/4 v3, 0x0

    .line 228
    const/4 v4, 0x0

    .line 229
    .line 230
    move-object/from16 v1, p0

    .line 231
    .line 232
    .line 233
    invoke-static/range {v1 .. v6}, Lcom/sumsub/sns/core/presentation/base/l;->navigateTo$idensic_mobile_sdk_aar_defaultRelease$default(Lcom/sumsub/sns/core/presentation/base/l;Landroidx/fragment/app/Fragment;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 234
    return-void

    .line 235
    .line 236
    :cond_5
    instance-of v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/p;

    .line 237
    .line 238
    if-eqz v1, :cond_6

    .line 239
    .line 240
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;->i:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/n;

    .line 241
    .line 242
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/h;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/h;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;

    .line 248
    .line 249
    .line 250
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;-><init>()V

    .line 251
    .line 252
    new-instance v2, Landroid/os/Bundle;

    .line 253
    .line 254
    .line 255
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2, v5, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v0, v4}, Lcom/sumsub/sns/core/presentation/base/l;->forResult(Ljava/lang/String;)Lcom/sumsub/sns/core/presentation/base/l;

    .line 265
    move-result-object v2

    .line 266
    const/4 v5, 0x6

    .line 267
    const/4 v6, 0x0

    .line 268
    const/4 v3, 0x0

    .line 269
    const/4 v4, 0x0

    .line 270
    .line 271
    move-object/from16 v1, p0

    .line 272
    .line 273
    .line 274
    invoke-static/range {v1 .. v6}, Lcom/sumsub/sns/core/presentation/base/l;->navigateTo$idensic_mobile_sdk_aar_defaultRelease$default(Lcom/sumsub/sns/core/presentation/base/l;Landroidx/fragment/app/Fragment;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 275
    return-void

    .line 276
    .line 277
    :cond_6
    move-object/from16 v1, p0

    .line 278
    .line 279
    instance-of v2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/W;

    .line 280
    .line 281
    if-eqz v2, :cond_7

    .line 282
    .line 283
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/W;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v1, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/W;)V

    .line 287
    return-void

    .line 288
    .line 289
    :cond_7
    instance-of v2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/U;

    .line 290
    .line 291
    if-eqz v2, :cond_8

    .line 292
    .line 293
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/U;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v1, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/U;)V

    .line 297
    return-void

    .line 298
    .line 299
    :cond_8
    instance-of v2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/k;

    .line 300
    .line 301
    if-eqz v2, :cond_1a

    .line 302
    .line 303
    iget-object v2, v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->h:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/m;

    .line 304
    .line 305
    if-nez v2, :cond_9

    .line 306
    .line 307
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/m;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 311
    move-result-object v4

    .line 312
    .line 313
    .line 314
    invoke-direct {v2, v4}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/m;-><init>(Landroidx/fragment/app/FragmentActivity;)V

    .line 315
    .line 316
    iput-object v2, v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->h:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/m;

    .line 317
    .line 318
    :cond_9
    iget-object v2, v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->h:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/m;

    .line 319
    .line 320
    if-eqz v2, :cond_19

    .line 321
    .line 322
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/k;

    .line 323
    .line 324
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/k;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/h;

    .line 325
    .line 326
    instance-of v4, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/g;

    .line 327
    .line 328
    const-string v5, "Activity is null"

    .line 329
    .line 330
    if-eqz v4, :cond_b

    .line 331
    .line 332
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/g;

    .line 333
    .line 334
    iget-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/g;->a:Ljava/lang/String;

    .line 335
    .line 336
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/g;->b:Ljava/net/URL;

    .line 337
    .line 338
    iget-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/g;->c:Ljava/lang/String;

    .line 339
    .line 340
    iget-object v8, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/g;->d:Lde/authada/library/api/authentication/StartCallback;

    .line 341
    .line 342
    iget-object v12, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/g;->e:Lkotlin/jvm/functions/Function1;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/m;->a()V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/m;->b()V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/m;->c()V

    .line 352
    .line 353
    :try_start_0
    iget-object v0, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/m;->a:Ljava/lang/ref/WeakReference;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 357
    move-result-object v0

    .line 358
    .line 359
    check-cast v0, Landroid/app/Activity;

    .line 360
    .line 361
    if-eqz v0, :cond_a

    .line 362
    .line 363
    .line 364
    invoke-static {v4}, Lde/authada/library/api/network/Certificate;->constructor-impl(Ljava/lang/String;)Ljava/lang/String;

    .line 365
    move-result-object v4

    .line 366
    .line 367
    .line 368
    invoke-static {v4}, Lde/authada/library/api/network/Certificate;->box-impl(Ljava/lang/String;)Lde/authada/library/api/network/Certificate;

    .line 369
    move-result-object v4

    .line 370
    .line 371
    .line 372
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 373
    move-result-object v4

    .line 374
    .line 375
    sget-object v5, Lde/authada/library/api/AuthadaAuthenticationLibraryConfig;->Companion:Lde/authada/library/api/AuthadaAuthenticationLibraryConfig$Companion;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v5, v0, v3, v4}, Lde/authada/library/api/AuthadaAuthenticationLibraryConfig$Companion;->newInstance(Landroid/app/Activity;Ljava/net/URL;Ljava/util/List;)Lde/authada/library/api/AuthadaAuthenticationLibraryConfig;

    .line 379
    move-result-object v0

    .line 380
    .line 381
    sget-object v3, Lde/authada/library/api/AuthadaAuthenticationLibrary;->INSTANCE:Lde/authada/library/api/AuthadaAuthenticationLibrary;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v3, v0}, Lde/authada/library/api/AuthadaAuthenticationLibrary;->authenticate(Lde/authada/library/api/AuthadaAuthenticationLibraryConfig;)Lde/authada/library/api/authentication/Authentication;

    .line 385
    move-result-object v6

    .line 386
    .line 387
    iput-object v6, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/m;->b:Lde/authada/library/api/authentication/Authentication;

    .line 388
    .line 389
    if-eqz v6, :cond_19

    .line 390
    const/4 v10, 0x4

    .line 391
    const/4 v11, 0x0

    .line 392
    const/4 v9, 0x0

    .line 393
    .line 394
    .line 395
    invoke-static/range {v6 .. v11}, Lde/authada/library/api/authentication/Authentication$DefaultImpls;->start$default(Lde/authada/library/api/authentication/Authentication;Ljava/lang/String;Lde/authada/library/api/authentication/StartCallback;Lde/authada/library/api/analytics/AnalyticsCallback;ILjava/lang/Object;)V

    .line 396
    return-void

    .line 397
    :catchall_0
    move-exception v0

    .line 398
    goto :goto_0

    .line 399
    .line 400
    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 401
    .line 402
    .line 403
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 404
    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 405
    .line 406
    .line 407
    :goto_0
    invoke-interface {v12, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 408
    .line 409
    goto/16 :goto_6

    .line 410
    .line 411
    :cond_b
    instance-of v4, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/d;

    .line 412
    .line 413
    if-eqz v4, :cond_f

    .line 414
    .line 415
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/d;

    .line 416
    .line 417
    iget-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/d;->a:Lde/authada/library/api/authentication/Pin;

    .line 418
    .line 419
    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/d;->b:Lde/authada/library/api/Can;

    .line 420
    .line 421
    iget-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/d;->c:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/i;

    .line 422
    .line 423
    iget-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/d;->d:Lkotlin/jvm/functions/Function1;

    .line 424
    .line 425
    iget-object v0, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/m;->b:Lde/authada/library/api/authentication/Authentication;

    .line 426
    .line 427
    if-nez v0, :cond_d

    .line 428
    .line 429
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/p;

    .line 430
    .line 431
    .line 432
    invoke-virtual {v4}, Lde/authada/library/api/authentication/Pin;->getPin()[I

    .line 433
    move-result-object v8

    .line 434
    .line 435
    const/16 v15, 0x3e

    .line 436
    .line 437
    const/16 v16, 0x0

    .line 438
    .line 439
    const-string v9, ""

    .line 440
    const/4 v10, 0x0

    .line 441
    const/4 v11, 0x0

    .line 442
    const/4 v12, 0x0

    .line 443
    const/4 v13, 0x0

    .line 444
    const/4 v14, 0x0

    .line 445
    .line 446
    .line 447
    invoke-static/range {v8 .. v16}, Lkotlin/collections/ArraysKt;->joinToString$default([ILjava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 448
    move-result-object v2

    .line 449
    .line 450
    if-eqz v5, :cond_c

    .line 451
    .line 452
    .line 453
    invoke-virtual {v5}, Lde/authada/library/api/Can;->getCan()[I

    .line 454
    move-result-object v8

    .line 455
    .line 456
    if-eqz v8, :cond_c

    .line 457
    .line 458
    const/16 v15, 0x3e

    .line 459
    .line 460
    const/16 v16, 0x0

    .line 461
    .line 462
    const-string v9, ""

    .line 463
    const/4 v10, 0x0

    .line 464
    const/4 v11, 0x0

    .line 465
    const/4 v12, 0x0

    .line 466
    const/4 v13, 0x0

    .line 467
    const/4 v14, 0x0

    .line 468
    .line 469
    .line 470
    invoke-static/range {v8 .. v16}, Lkotlin/collections/ArraysKt;->joinToString$default([ILjava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 471
    move-result-object v3

    .line 472
    .line 473
    .line 474
    :cond_c
    invoke-direct {v0, v2, v3}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/p;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 475
    .line 476
    .line 477
    invoke-interface {v7, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 478
    return-void

    .line 479
    .line 480
    :cond_d
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/k;

    .line 481
    .line 482
    .line 483
    invoke-direct {v3, v6, v4}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/k;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/i;Lde/authada/library/api/authentication/Pin;)V

    .line 484
    .line 485
    if-eqz v5, :cond_e

    .line 486
    .line 487
    .line 488
    :try_start_1
    invoke-interface {v0, v5}, Lde/authada/library/api/authentication/Authentication;->setCan(Lde/authada/library/api/Can;)V

    .line 489
    goto :goto_1

    .line 490
    :catchall_1
    move-exception v0

    .line 491
    goto :goto_2

    .line 492
    .line 493
    :cond_e
    :goto_1
    iget-object v0, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/m;->b:Lde/authada/library/api/authentication/Authentication;

    .line 494
    .line 495
    if-eqz v0, :cond_19

    .line 496
    .line 497
    .line 498
    invoke-interface {v0, v4, v3}, Lde/authada/library/api/authentication/Authentication;->pinAuthentication(Lde/authada/library/api/authentication/Pin;Lde/authada/library/api/authentication/AuthenticationCallback;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 499
    return-void

    .line 500
    .line 501
    .line 502
    :goto_2
    invoke-interface {v7, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 503
    .line 504
    goto/16 :goto_6

    .line 505
    .line 506
    :cond_f
    instance-of v3, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/e;

    .line 507
    .line 508
    if-eqz v3, :cond_13

    .line 509
    .line 510
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/e;

    .line 511
    .line 512
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/e;->a:Lde/authada/library/api/pinChanger/TPin;

    .line 513
    .line 514
    iget-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/e;->b:Lde/authada/library/api/authentication/Pin;

    .line 515
    .line 516
    iget-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/e;->c:Lde/authada/library/api/Can;

    .line 517
    .line 518
    iget-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/e;->d:Ljava/lang/Integer;

    .line 519
    .line 520
    iget-object v8, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/e;->e:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/j;

    .line 521
    .line 522
    iget-object v9, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/e;->f:Lkotlin/jvm/functions/Function1;

    .line 523
    .line 524
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/l;

    .line 525
    .line 526
    .line 527
    invoke-direct {v0, v8, v3, v4, v7}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/l;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/j;Lde/authada/library/api/pinChanger/TPin;Lde/authada/library/api/authentication/Pin;Ljava/lang/Integer;)V

    .line 528
    .line 529
    :try_start_2
    iget-object v8, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/m;->a:Ljava/lang/ref/WeakReference;

    .line 530
    .line 531
    .line 532
    invoke-virtual {v8}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 533
    move-result-object v8

    .line 534
    .line 535
    check-cast v8, Landroid/app/Activity;

    .line 536
    .line 537
    if-eqz v8, :cond_12

    .line 538
    .line 539
    sget-object v5, Lde/authada/library/api/AuthadaAuthenticationLibrary;->INSTANCE:Lde/authada/library/api/AuthadaAuthenticationLibrary;

    .line 540
    .line 541
    .line 542
    invoke-virtual {v5}, Lde/authada/library/api/AuthadaAuthenticationLibrary;->pinChanger()Lde/authada/library/api/pinChanger/PinChanger;

    .line 543
    move-result-object v5

    .line 544
    .line 545
    iput-object v5, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/m;->c:Lde/authada/library/api/pinChanger/PinChanger;

    .line 546
    .line 547
    if-eqz v6, :cond_10

    .line 548
    .line 549
    if-eqz v5, :cond_10

    .line 550
    .line 551
    .line 552
    invoke-interface {v5, v6}, Lde/authada/library/api/pinChanger/PinChanger;->setCan(Lde/authada/library/api/Can;)V

    .line 553
    goto :goto_3

    .line 554
    :catchall_2
    move-exception v0

    .line 555
    goto :goto_4

    .line 556
    .line 557
    :cond_10
    :goto_3
    if-eqz v7, :cond_11

    .line 558
    .line 559
    iget-object v5, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/m;->c:Lde/authada/library/api/pinChanger/PinChanger;

    .line 560
    .line 561
    if-eqz v5, :cond_11

    .line 562
    .line 563
    .line 564
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 565
    move-result v6

    .line 566
    .line 567
    .line 568
    invoke-interface {v5, v6}, Lde/authada/library/api/pinChanger/PinChanger;->_useForTestingOnlySetSixthDigitOfOldPin(I)V

    .line 569
    .line 570
    :cond_11
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/m;->c:Lde/authada/library/api/pinChanger/PinChanger;

    .line 571
    .line 572
    if-eqz v2, :cond_19

    .line 573
    .line 574
    .line 575
    invoke-interface {v2, v3, v4, v8, v0}, Lde/authada/library/api/pinChanger/PinChanger;->changeFiveDigitPin(Lde/authada/library/api/pinChanger/TPin;Lde/authada/library/api/authentication/Pin;Landroid/app/Activity;Lde/authada/library/api/pinChanger/PinChangerCallback;)V

    .line 576
    return-void

    .line 577
    .line 578
    :cond_12
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 579
    .line 580
    .line 581
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 582
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 583
    .line 584
    .line 585
    :goto_4
    invoke-interface {v9, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 586
    goto :goto_6

    .line 587
    .line 588
    :cond_13
    instance-of v3, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/f;

    .line 589
    .line 590
    if-eqz v3, :cond_15

    .line 591
    .line 592
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/f;

    .line 593
    .line 594
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/f;->a:Lde/authada/library/api/unblock/Puk;

    .line 595
    .line 596
    iget-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/f;->b:Lde/authada/library/api/unblock/UnblockerCallback;

    .line 597
    .line 598
    iget-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/f;->c:Lkotlin/jvm/functions/Function1;

    .line 599
    .line 600
    :try_start_3
    iget-object v0, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/m;->a:Ljava/lang/ref/WeakReference;

    .line 601
    .line 602
    .line 603
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 604
    move-result-object v0

    .line 605
    .line 606
    check-cast v0, Landroid/app/Activity;

    .line 607
    .line 608
    if-eqz v0, :cond_14

    .line 609
    .line 610
    sget-object v5, Lde/authada/library/api/AuthadaAuthenticationLibrary;->INSTANCE:Lde/authada/library/api/AuthadaAuthenticationLibrary;

    .line 611
    .line 612
    .line 613
    invoke-virtual {v5}, Lde/authada/library/api/AuthadaAuthenticationLibrary;->unblocker()Lde/authada/library/api/unblock/Unblocker;

    .line 614
    move-result-object v5

    .line 615
    .line 616
    iput-object v5, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/m;->d:Lde/authada/library/api/unblock/Unblocker;

    .line 617
    .line 618
    if-eqz v5, :cond_19

    .line 619
    .line 620
    .line 621
    invoke-interface {v5, v3, v0, v4}, Lde/authada/library/api/unblock/Unblocker;->unblock(Lde/authada/library/api/unblock/Puk;Landroid/app/Activity;Lde/authada/library/api/unblock/UnblockerCallback;)V

    .line 622
    return-void

    .line 623
    :catchall_3
    move-exception v0

    .line 624
    goto :goto_5

    .line 625
    .line 626
    :cond_14
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 627
    .line 628
    .line 629
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 630
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 631
    .line 632
    .line 633
    :goto_5
    invoke-interface {v6, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 634
    goto :goto_6

    .line 635
    .line 636
    :cond_15
    instance-of v3, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/a;

    .line 637
    .line 638
    if-eqz v3, :cond_16

    .line 639
    .line 640
    .line 641
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/m;->b()V

    .line 642
    return-void

    .line 643
    .line 644
    :cond_16
    instance-of v3, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/b;

    .line 645
    .line 646
    if-eqz v3, :cond_17

    .line 647
    .line 648
    .line 649
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/m;->c()V

    .line 650
    return-void

    .line 651
    .line 652
    :cond_17
    instance-of v0, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/c;

    .line 653
    .line 654
    if-eqz v0, :cond_18

    .line 655
    .line 656
    .line 657
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/m;->a()V

    .line 658
    return-void

    .line 659
    .line 660
    :cond_18
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 661
    .line 662
    .line 663
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 664
    throw v0

    .line 665
    :cond_19
    :goto_6
    return-void

    .line 666
    .line 667
    :cond_1a
    instance-of v2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/V;

    .line 668
    .line 669
    if-eqz v2, :cond_1b

    .line 670
    .line 671
    iget-object v0, v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->f:Lcom/sumsub/sns/internal/core/presentation/nfc/b;

    .line 672
    .line 673
    .line 674
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/common/h;->p()V

    .line 675
    return-void

    .line 676
    .line 677
    .line 678
    :cond_1b
    invoke-super/range {p0 .. p1}, Lcom/sumsub/sns/core/presentation/base/l;->handleEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 679
    return-void
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
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
.end method

.method public final bridge synthetic handleState(Lcom/sumsub/sns/core/presentation/base/s;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T0;)V

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

.method public final onDestroy()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->a:Lkotlin/Lazy;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 17
    .line 18
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 19
    .line 20
    const-string v2, "SNSEidMain"

    .line 21
    .line 22
    const-string v3, "Reset"

    .line 23
    const/4 v4, 0x0

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v2, v3, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 27
    .line 28
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->q:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/h0;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->b(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/o0;)V

    .line 32
    .line 33
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->h:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/m;

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/m;->a()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/m;->b()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/m;->c()V

    .line 45
    .line 46
    :cond_0
    iput-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->h:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/m;

    .line 47
    return-void
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

.method public final onDestroyView()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/sumsub/sns/core/presentation/base/I;->onDestroyView()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->g:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T0;

    .line 7
    return-void
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

.method public final onFinishCalled(Lcom/sumsub/sns/internal/core/common/w;)Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->f()Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;->isHidden()Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->f()Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;->hide()V

    .line 23
    :cond_0
    return v1

    .line 24
    .line 25
    :cond_1
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->i:Z

    .line 26
    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->a:Lkotlin/Lazy;

    .line 30
    .line 31
    .line 32
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;->a(Lcom/sumsub/sns/internal/core/common/w;)Z

    .line 39
    move-result p1

    .line 40
    .line 41
    if-nez p1, :cond_2

    .line 42
    return v1

    .line 43
    .line 44
    .line 45
    :cond_2
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->e()V

    .line 46
    const/4 p1, 0x1

    .line 47
    return p1
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
.end method

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/sumsub/sns/core/presentation/base/I;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/c1;

    .line 14
    .line 15
    .line 16
    invoke-direct {p2, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/c1;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;)V

    .line 17
    .line 18
    .line 19
    const-string/jumbo v0, "request_key_pin"

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v0, p0, p2}, Landroidx/fragment/app/FragmentManager;->setFragmentResultListener(Ljava/lang/String;Landroidx/lifecycle/LifecycleOwner;Landroidx/fragment/app/FragmentResultListener;)V

    .line 23
    return-void
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
