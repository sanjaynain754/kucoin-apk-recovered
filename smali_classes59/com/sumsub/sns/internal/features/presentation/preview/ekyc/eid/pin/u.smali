.class public final Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;
.super Lcom/sumsub/sns/core/presentation/base/I;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sumsub/sns/core/presentation/base/I<",
        "Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/D;",
        "Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/M;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;",
        "Lcom/sumsub/sns/core/presentation/base/I;",
        "Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/D;",
        "Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/M;",
        "<init>",
        "()V",
        "com/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/n",
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
        "SMAP\nSNSEidPinFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSEidPinFragment.kt\ncom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/SNSEidPinFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,102:1\n106#2,15:103\n49#3:118\n65#3,16:119\n93#3,3:135\n256#4,2:138\n*S KotlinDebug\n*F\n+ 1 SNSEidPinFragment.kt\ncom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/SNSEidPinFragment\n*L\n23#1:103,15\n61#1:118\n61#1:119,16\n61#1:135,3\n84#1:138,2\n*E\n"
    }
.end annotation


# static fields
.field public static final i:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/n;

.field public static final synthetic j:[Lkotlin/reflect/KProperty;


# instance fields
.field public final a:Lkotlin/Lazy;

.field public final b:Ljava/lang/String;

.field public final c:Lcom/sumsub/sns/internal/core/common/L;

.field public final d:Lcom/sumsub/sns/internal/core/common/L;

.field public final e:Lcom/sumsub/sns/internal/core/common/L;

.field public final f:Lcom/sumsub/sns/internal/core/common/L;

.field public final g:Lcom/sumsub/sns/internal/core/analytics/Screen;

.field public h:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "title"

    .line 6
    .line 7
    const-string v2, "getTitle()Landroid/widget/TextView;"

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
    const-string/jumbo v2, "subtitle"

    .line 16
    .line 17
    const-string v4, "getSubtitle()Landroid/widget/TextView;"

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v2, v4, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    .line 24
    const-string/jumbo v4, "pinView"

    .line 25
    .line 26
    const-string v5, "getPinView()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;"

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v4, v5, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 30
    move-result-object v4

    .line 31
    .line 32
    const-string v5, "errorText"

    .line 33
    .line 34
    const-string v6, "getErrorText()Landroid/widget/TextView;"

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
    sput-object v5, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;->j:[Lkotlin/reflect/KProperty;

    .line 55
    .line 56
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/n;

    .line 57
    .line 58
    .line 59
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/n;-><init>()V

    .line 60
    .line 61
    sput-object v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;->i:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/n;

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
    invoke-direct {p0}, Lcom/sumsub/sns/core/presentation/base/I;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/t;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/t;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;)V

    .line 9
    .line 10
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/p;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/p;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;)V

    .line 14
    .line 15
    sget-object v2, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 16
    .line 17
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/q;

    .line 18
    .line 19
    .line 20
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/q;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/p;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v2, v3}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/M;

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/r;

    .line 33
    .line 34
    .line 35
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/r;-><init>(Lkotlin/Lazy;)V

    .line 36
    .line 37
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/s;

    .line 38
    .line 39
    .line 40
    invoke-direct {v4, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/s;-><init>(Lkotlin/Lazy;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p0, v2, v3, v4, v0}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;->a:Lkotlin/Lazy;

    .line 47
    .line 48
    const-string v0, "E_KYC"

    .line 49
    .line 50
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;->b:Ljava/lang/String;

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
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;->c:Lcom/sumsub/sns/internal/core/common/L;

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
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;->d:Lcom/sumsub/sns/internal/core/common/L;

    .line 69
    .line 70
    sget v0, Lcom/sumsub/sns/R$id;->sns_pin_code:I

    .line 71
    .line 72
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 73
    .line 74
    .line 75
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 76
    .line 77
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;->e:Lcom/sumsub/sns/internal/core/common/L;

    .line 78
    .line 79
    sget v0, Lcom/sumsub/sns/R$id;->sns_error:I

    .line 80
    .line 81
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 82
    .line 83
    .line 84
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 85
    .line 86
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;->f:Lcom/sumsub/sns/internal/core/common/L;

    .line 87
    .line 88
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/Screen;->EidPinPad:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 89
    .line 90
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;->g:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 91
    return-void
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

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/x;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getServiceLocator$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/domain/h;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, p0, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/x;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;Lcom/sumsub/sns/internal/core/domain/h;Landroid/os/Bundle;)V

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
.end method


# virtual methods
.method public final f()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;->e:Lcom/sumsub/sns/internal/core/common/L;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;->j:[Lkotlin/reflect/KProperty;

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
    check-cast v0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

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
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/M;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/M;->f:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 11
    .line 12
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/M;->h:[Lkotlin/reflect/KProperty;

    .line 13
    const/4 v2, 0x4

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
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/SNSEidPinViewModel$Step;

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/M;->a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/SNSEidPinViewModel$Step;)Ljava/util/Map;

    .line 25
    move-result-object v0

    .line 26
    return-object v0
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
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;->b:Ljava/lang/String;

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
    sget v0, Lcom/sumsub/sns/R$layout;->sns_fragment_eid_pin:I

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
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/M;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/M;->f:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 11
    .line 12
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/M;->h:[Lkotlin/reflect/KProperty;

    .line 13
    const/4 v2, 0x4

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
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/SNSEidPinViewModel$Step;

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/M;->a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/SNSEidPinViewModel$Step;)Ljava/util/Map;

    .line 25
    move-result-object v0

    .line 26
    return-object v0
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

.method public final getScreen()Lcom/sumsub/sns/internal/core/analytics/Screen;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;->g:Lcom/sumsub/sns/internal/core/analytics/Screen;

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

.method public final getViewModel$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/presentation/base/C;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/M;

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
    .locals 5

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/v;

    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Landroid/os/Bundle;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 12
    .line 13
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/v;

    .line 14
    .line 15
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/v;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/m;

    .line 16
    .line 17
    const-string v3, "DOCUMENT_RESULT"

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v3, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 21
    .line 22
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;->a:Lkotlin/Lazy;

    .line 23
    .line 24
    .line 25
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/M;

    .line 29
    .line 30
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/M;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/k;

    .line 31
    .line 32
    .line 33
    const-string/jumbo v3, "pin_mode"

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v3, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 37
    .line 38
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 39
    const/4 p1, 0x0

    .line 40
    .line 41
    .line 42
    invoke-static {p0, v2, v0, v1, p1}, Lcom/sumsub/sns/core/presentation/base/l;->finishWithResult$idensic_mobile_sdk_aar_defaultRelease$default(Lcom/sumsub/sns/core/presentation/base/l;ILandroid/os/Bundle;ILjava/lang/Object;)V

    .line 43
    return-void

    .line 44
    .line 45
    :cond_0
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/w;

    .line 46
    .line 47
    if-eqz v0, :cond_4

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;->f()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    .line 51
    move-result-object v0

    .line 52
    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->setError(Z)V

    .line 57
    .line 58
    :cond_1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;->f:Lcom/sumsub/sns/internal/core/common/L;

    .line 59
    .line 60
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;->j:[Lkotlin/reflect/KProperty;

    .line 61
    const/4 v3, 0x3

    .line 62
    .line 63
    aget-object v4, v1, v3

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, p0, v4}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 67
    move-result-object v0

    .line 68
    .line 69
    check-cast v0, Landroid/widget/TextView;

    .line 70
    .line 71
    if-eqz v0, :cond_2

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 75
    .line 76
    :cond_2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;->f:Lcom/sumsub/sns/internal/core/common/L;

    .line 77
    .line 78
    aget-object v1, v1, v3

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, p0, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 82
    move-result-object v0

    .line 83
    .line 84
    check-cast v0, Landroid/widget/TextView;

    .line 85
    .line 86
    if-eqz v0, :cond_3

    .line 87
    .line 88
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/w;

    .line 89
    .line 90
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/w;->a:Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 94
    :cond_3
    return-void

    .line 95
    .line 96
    .line 97
    :cond_4
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/l;->handleEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

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

.method public final handleState(Lcom/sumsub/sns/core/presentation/base/s;Landroid/os/Bundle;)V
    .locals 4

    .line 1
    .line 2
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/D;

    .line 3
    .line 4
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;->c:Lcom/sumsub/sns/internal/core/common/L;

    .line 5
    .line 6
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;->j:[Lkotlin/reflect/KProperty;

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    aget-object v1, v0, v1

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2, p0, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 13
    move-result-object p2

    .line 14
    .line 15
    check-cast p2, Landroid/widget/TextView;

    .line 16
    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/D;->a:Ljava/lang/CharSequence;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    .line 24
    :cond_0
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;->d:Lcom/sumsub/sns/internal/core/common/L;

    .line 25
    const/4 v1, 0x1

    .line 26
    .line 27
    aget-object v0, v0, v1

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2, p0, v0}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 31
    move-result-object p2

    .line 32
    .line 33
    check-cast p2, Landroid/widget/TextView;

    .line 34
    .line 35
    if-eqz p2, :cond_1

    .line 36
    .line 37
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/D;->b:Ljava/lang/CharSequence;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;->f()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    .line 44
    move-result-object p2

    .line 45
    .line 46
    if-eqz p2, :cond_2

    .line 47
    .line 48
    iget v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/D;->c:I

    .line 49
    .line 50
    .line 51
    invoke-virtual {p2, v0}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->setItemCount(I)V

    .line 52
    .line 53
    .line 54
    :cond_2
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;->f()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    .line 55
    move-result-object p2

    .line 56
    .line 57
    if-eqz p2, :cond_3

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 61
    move-result-object p2

    .line 62
    .line 63
    if-eqz p2, :cond_3

    .line 64
    .line 65
    .line 66
    invoke-interface {p2}, Landroid/text/Editable;->clear()V

    .line 67
    .line 68
    :cond_3
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;->h:Ljava/util/Map;

    .line 69
    .line 70
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/D;->d:Ljava/util/Map;

    .line 71
    .line 72
    .line 73
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    move-result p2

    .line 75
    .line 76
    if-nez p2, :cond_6

    .line 77
    .line 78
    iget-object p2, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/D;->d:Ljava/util/Map;

    .line 79
    .line 80
    .line 81
    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    .line 82
    move-result p2

    .line 83
    .line 84
    if-nez p2, :cond_6

    .line 85
    .line 86
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;->h:Ljava/util/Map;

    .line 87
    .line 88
    if-eqz p2, :cond_4

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    .line 92
    move-result-object p2

    .line 93
    .line 94
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;->g:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 95
    .line 96
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;->b:Ljava/lang/String;

    .line 97
    .line 98
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/D;->d:Ljava/util/Map;

    .line 99
    .line 100
    const/16 v3, 0x8

    .line 101
    .line 102
    .line 103
    invoke-static {p2, v0, v1, v2, v3}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Ljava/util/Map;I)V

    .line 104
    .line 105
    .line 106
    :cond_4
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;->f()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    .line 107
    move-result-object p2

    .line 108
    .line 109
    if-eqz p2, :cond_5

    .line 110
    .line 111
    .line 112
    invoke-static {p2}, Lcom/sumsub/sns/internal/core/common/h;->f(Landroid/view/View;)V

    .line 113
    .line 114
    :cond_5
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/D;->d:Ljava/util/Map;

    .line 115
    .line 116
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;->h:Ljava/util/Map;

    .line 117
    :cond_6
    return-void
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

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/sumsub/sns/core/presentation/base/I;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;->f()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    .line 7
    move-result-object p2

    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/o;

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/o;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;->f()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    .line 21
    move-result-object p2

    .line 22
    .line 23
    if-eqz p2, :cond_1

    .line 24
    const/4 v0, 0x1

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2, v0}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->setPassword(Z)V

    .line 28
    .line 29
    :cond_1
    instance-of p2, p1, Landroid/view/ViewGroup;

    .line 30
    .line 31
    if-eqz p2, :cond_2

    .line 32
    .line 33
    check-cast p1, Landroid/view/ViewGroup;

    .line 34
    goto :goto_0

    .line 35
    :cond_2
    const/4 p1, 0x0

    .line 36
    .line 37
    :goto_0
    if-eqz p1, :cond_3

    .line 38
    const/4 p2, 0x4

    .line 39
    .line 40
    .line 41
    filled-new-array {p2}, [I

    .line 42
    move-result-object p2

    .line 43
    .line 44
    .line 45
    invoke-static {p1, p2}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/view/ViewGroup;[I)V

    .line 46
    :cond_3
    return-void
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
.end method
