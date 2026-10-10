.class public final Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;
.super Lcom/sumsub/sns/core/presentation/base/M0;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final synthetic U:[Lkotlin/reflect/KProperty;


# instance fields
.field public A:Z

.field public B:Z

.field public C:Z

.field public D:Z

.field public E:Z

.field public final F:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public G:Z

.field public final H:Lkotlinx/coroutines/flow/n;

.field public I:Z

.field public final J:Z

.field public final K:Ljava/util/List;

.field public final L:Z

.field public M:J

.field public N:Z

.field public O:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$PhotoCheckResult;

.field public final P:Lkotlinx/coroutines/channels/d;

.field public Q:Z

.field public final R:Lkotlinx/coroutines/channels/d;

.field public S:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a1;

.field public T:Z

.field public final a:Lcom/sumsub/sns/internal/features/data/model/common/X;

.field public final b:Ljava/lang/String;

.field public final c:Z

.field public final d:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

.field public final e:Lcom/sumsub/sns/internal/ml/badphotos/c;

.field public final f:Lcom/sumsub/sns/internal/ml/docdetector/d;

.field public final g:Lcom/sumsub/sns/internal/ml/badphotos/e;

.field public final h:Lcom/sumsub/sns/internal/ml/autocapture/d;

.field public final i:Lcom/sumsub/sns/internal/ml/autocapture/g;

.field public final j:Landroidx/lifecycle/SavedStateHandle;

.field public final k:Lcom/sumsub/sns/internal/features/presentation/utils/M;

.field public final l:Lcom/sumsub/sns/internal/features/presentation/camera/m;

.field public final m:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t2;

.field public final n:Lcom/sumsub/sns/internal/core/presentation/android/g;

.field public o:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

.field public p:Z

.field public final q:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public r:Z

.field public final s:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final t:Lkotlin/Lazy;

.field public final u:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final v:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final w:Lkotlin/Lazy;

.field public final x:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final y:Lkotlin/Lazy;

.field public z:Ljava/io/File;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;

    .line 3
    .line 4
    const-string v1, "collectedResults"

    .line 5
    .line 6
    const-string v2, "getCollectedResults()Ljava/util/List;"

    .line 7
    const/4 v3, 0x0

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1, v2, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    const-string/jumbo v2, "secondSidePromptPending"

    .line 15
    .line 16
    const-string v4, "getSecondSidePromptPending()Z"

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v2, v4, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 20
    move-result-object v2

    .line 21
    .line 22
    const-string v4, "ffAutodocToggle"

    .line 23
    .line 24
    const-string v5, "getFfAutodocToggle()Z"

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v4, v5, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 28
    move-result-object v4

    .line 29
    .line 30
    const-string v5, "ffAutocaptureTilt"

    .line 31
    .line 32
    const-string v6, "getFfAutocaptureTilt()Z"

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v5, v6, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 36
    move-result-object v5

    .line 37
    .line 38
    .line 39
    const-string/jumbo v6, "useLegacyCamera"

    .line 40
    .line 41
    const-string v7, "getUseLegacyCamera()Z"

    .line 42
    .line 43
    .line 44
    invoke-static {v0, v6, v7, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 45
    move-result-object v6

    .line 46
    .line 47
    const-string v7, "autoCaptureRequired"

    .line 48
    .line 49
    const-string v8, "getAutoCaptureRequired$idensic_mobile_sdk_aar_defaultRelease()Z"

    .line 50
    .line 51
    .line 52
    invoke-static {v0, v7, v8, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 53
    move-result-object v0

    .line 54
    const/4 v7, 0x6

    .line 55
    .line 56
    new-array v7, v7, [Lkotlin/reflect/KProperty;

    .line 57
    .line 58
    aput-object v1, v7, v3

    .line 59
    const/4 v1, 0x1

    .line 60
    .line 61
    aput-object v2, v7, v1

    .line 62
    const/4 v1, 0x2

    .line 63
    .line 64
    aput-object v4, v7, v1

    .line 65
    const/4 v1, 0x3

    .line 66
    .line 67
    aput-object v5, v7, v1

    .line 68
    const/4 v1, 0x4

    .line 69
    .line 70
    aput-object v6, v7, v1

    .line 71
    const/4 v1, 0x5

    .line 72
    .line 73
    aput-object v0, v7, v1

    .line 74
    .line 75
    sput-object v7, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->U:[Lkotlin/reflect/KProperty;

    .line 76
    return-void
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

.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/model/common/X;Ljava/lang/String;Ljava/lang/String;ZLcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/internal/ml/badphotos/c;Lcom/sumsub/sns/internal/ml/docdetector/d;Lcom/sumsub/sns/internal/ml/badphotos/e;Lcom/sumsub/sns/internal/ml/autocapture/d;Lcom/sumsub/sns/internal/ml/autocapture/g;Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/features/presentation/utils/M;)V
    .locals 0

    .line 1
    invoke-direct {p0, p5, p6}, Lcom/sumsub/sns/core/presentation/base/M0;-><init>(Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;)V

    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->a:Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 3
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->b:Ljava/lang/String;

    .line 4
    iput-boolean p4, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->c:Z

    .line 5
    iput-object p6, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->d:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 6
    iput-object p7, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->e:Lcom/sumsub/sns/internal/ml/badphotos/c;

    .line 7
    iput-object p8, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->f:Lcom/sumsub/sns/internal/ml/docdetector/d;

    .line 8
    iput-object p9, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->g:Lcom/sumsub/sns/internal/ml/badphotos/e;

    .line 9
    iput-object p10, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->h:Lcom/sumsub/sns/internal/ml/autocapture/d;

    .line 10
    iput-object p11, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->i:Lcom/sumsub/sns/internal/ml/autocapture/g;

    .line 11
    iput-object p12, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->j:Landroidx/lifecycle/SavedStateHandle;

    .line 12
    iput-object p13, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->k:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    move-object p5, p6

    move-object p6, p1

    .line 13
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/camera/m;

    const-string p4, "DocCapture"

    move-object p7, p2

    move-object p8, p3

    move-object p3, p12

    move-object p2, p0

    invoke-direct/range {p1 .. p8}, Lcom/sumsub/sns/internal/features/presentation/camera/m;-><init>(Lcom/sumsub/sns/core/presentation/base/C;Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/internal/features/data/model/common/X;Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->l:Lcom/sumsub/sns/internal/features/presentation/camera/m;

    .line 14
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t2;

    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t2;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;)V

    iput-object p1, p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->m:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t2;

    .line 15
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/android/g;

    invoke-direct {p1, p3}, Lcom/sumsub/sns/internal/core/presentation/android/g;-><init>(Landroidx/lifecycle/SavedStateHandle;)V

    iput-object p1, p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->n:Lcom/sumsub/sns/internal/core/presentation/android/g;

    .line 16
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 17
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p4

    .line 18
    const-string p5, "key_collected_results"

    const/4 p6, 0x0

    invoke-direct {p1, p3, p5, p4, p6}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 19
    iput-object p1, p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->q:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 20
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 21
    sget-object p4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 22
    const-string p5, "key_second_side_prompt_pending"

    invoke-direct {p1, p3, p5, p4, p6}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 23
    iput-object p1, p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->s:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 24
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e3;

    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e3;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->t:Lkotlin/Lazy;

    .line 25
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 26
    sget-object p5, Lcom/sumsub/sns/internal/ff/a;->t:Lcom/sumsub/sns/internal/ff/core/a;

    .line 27
    invoke-virtual {p5}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    move-result p5

    invoke-static {p5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p5

    .line 28
    const-string p7, "ffAutodocToggle"

    const/4 p8, 0x1

    invoke-direct {p1, p3, p7, p5, p8}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    iput-object p1, p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->u:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 29
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 30
    sget-object p5, Lcom/sumsub/sns/internal/ff/a;->w:Lcom/sumsub/sns/internal/ff/core/a;

    .line 31
    invoke-virtual {p5}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    move-result p5

    invoke-static {p5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p5

    .line 32
    const-string p7, "ffAutocaptureTilt"

    invoke-direct {p1, p3, p7, p5, p8}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    iput-object p1, p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->v:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 33
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/f3;

    invoke-direct {p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/f3;-><init>()V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->w:Lkotlin/Lazy;

    .line 34
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 35
    const-string p5, "key_use_legacy_camera"

    invoke-direct {p1, p3, p5, p4, p6}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 36
    iput-object p1, p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->x:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 37
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g3;

    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g3;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->y:Lkotlin/Lazy;

    .line 38
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 39
    const-string p5, "autoCaptureRequired"

    invoke-direct {p1, p3, p5, p4, p6}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 40
    iput-object p1, p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->F:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 41
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    const/16 p4, 0x1a

    const/4 p5, 0x0

    invoke-direct {p1, p5, p4}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/q1;I)V

    .line 42
    invoke-static {p1}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    move-result-object p1

    iput-object p1, p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->H:Lkotlinx/coroutines/flow/n;

    .line 43
    const-string p1, "EXTRA_IS_RETAKE"

    invoke-virtual {p3, p1}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_0

    :cond_0
    move p1, p6

    :goto_0
    iput-boolean p1, p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->J:Z

    .line 44
    const-string p1, "EXTRA_DOCUMENT_SIDES"

    invoke-virtual {p3, p1}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_2

    .line 45
    new-instance p3, Ljava/util/ArrayList;

    const/16 p4, 0xa

    invoke-static {p1, p4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result p4

    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 46
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    .line 47
    check-cast p4, Ljava/lang/String;

    .line 48
    sget-object p7, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->Companion:Lcom/sumsub/sns/internal/features/data/model/common/f2;

    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p4}, Lcom/sumsub/sns/internal/features/data/model/common/f2;->a(Ljava/lang/String;)Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    move-result-object p4

    if-nez p4, :cond_1

    sget-object p4, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->Front:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 49
    :cond_1
    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 50
    :cond_2
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p3

    .line 51
    :cond_3
    iput-object p3, p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->K:Ljava/util/List;

    .line 52
    iget-object p1, p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->j:Landroidx/lifecycle/SavedStateHandle;

    const-string p3, "EXTRA_IS_SEAMLESS"

    invoke-virtual {p1, p3}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_2

    :cond_4
    move p1, p6

    :goto_2
    iput-boolean p1, p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->L:Z

    const-wide/high16 p3, -0x8000000000000000L

    .line 53
    iput-wide p3, p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->M:J

    const/4 p1, 0x7

    .line 54
    invoke-static {p6, p5, p5, p1, p5}, Lkotlinx/coroutines/channels/g;->b(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lkotlinx/coroutines/channels/d;

    move-result-object p3

    iput-object p3, p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->P:Lkotlinx/coroutines/channels/d;

    .line 55
    invoke-static {p6, p5, p5, p1, p5}, Lkotlinx/coroutines/channels/g;->b(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lkotlinx/coroutines/channels/d;

    move-result-object p1

    iput-object p1, p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->R:Lkotlinx/coroutines/channels/d;

    return-void
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lcom/sumsub/sns/internal/core/presentation/camera/c;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 7

    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/D1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/D1;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/D1;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/D1;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/D1;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/D1;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/D1;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 20
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/D1;->d:I

    const/4 v3, 0x1

    const-string v4, " "

    const/4 v5, 0x3

    const/4 v6, 0x2

    if-eqz v2, :cond_4

    if-eq v2, v3, :cond_3

    if-eq v2, v6, :cond_2

    if-ne v2, v5, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_5

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/D1;->a:Lcom/sumsub/sns/internal/core/presentation/camera/c;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 21
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/D1;->a:Lcom/sumsub/sns/internal/core/presentation/camera/c;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/D1;->d:I

    const-string/jumbo p2, "sns_seamless_error_general"

    invoke-virtual {p0, p2, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    goto :goto_4

    :cond_5
    :goto_1
    check-cast p2, Ljava/lang/String;

    if-nez p2, :cond_6

    move-object p2, v4

    .line 22
    :cond_6
    iget p1, p1, Lcom/sumsub/sns/internal/core/presentation/camera/c;->a:I

    const/4 v2, 0x0

    if-ne p1, v5, :cond_8

    .line 23
    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/D1;->a:Lcom/sumsub/sns/internal/core/presentation/camera/c;

    iput v6, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/D1;->d:I

    const-string/jumbo p1, "sns_seamless_error_notEnoughStorage"

    invoke-virtual {p0, p1, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_7

    goto :goto_4

    :cond_7
    :goto_2
    check-cast p2, Ljava/lang/String;

    if-nez p2, :cond_9

    goto :goto_6

    :cond_8
    const/16 v3, 0x9

    if-eq p1, v3, :cond_a

    if-ne p1, v6, :cond_9

    goto :goto_3

    :cond_9
    move-object v4, p2

    goto :goto_6

    .line 24
    :cond_a
    :goto_3
    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/D1;->a:Lcom/sumsub/sns/internal/core/presentation/camera/c;

    iput v5, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/D1;->d:I

    const-string/jumbo p1, "sns_seamless_error_timeExceeded"

    invoke-virtual {p0, p1, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_b

    :goto_4
    return-object v1

    :cond_b
    :goto_5
    check-cast p2, Ljava/lang/String;

    if-nez p2, :cond_9

    .line 25
    :goto_6
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/i1;

    invoke-direct {p1, v4}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/i1;-><init>(Ljava/lang/String;)V

    .line 26
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/i1;)V

    .line 27
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Landroid/content/Context;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a1;Landroid/graphics/Rect;Lkotlinx/coroutines/channels/d;)Lkotlin/Unit;
    .locals 12

    .line 14
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 15
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 16
    const-string/jumbo v1, "photo animation finished"

    const/4 v2, 0x0

    const-string v3, "DocCapture"

    invoke-virtual {v0, v3, v1, v2}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 17
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v4

    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/o2;

    const/4 v11, 0x0

    move-object v6, p0

    move-object v7, p1

    move-object v8, p2

    move-object v9, p3

    move-object/from16 v10, p4

    invoke-direct/range {v5 .. v11}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/o2;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Landroid/content/Context;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a1;Landroid/graphics/Rect;Lkotlinx/coroutines/channels/d;Lkotlin/coroutines/Continuation;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    move-object v7, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 18
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;)Z
    .locals 2

    .line 63
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->L:Z

    if-nez v0, :cond_0

    .line 64
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->u:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->U:[Lkotlin/reflect/KProperty;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_1

    .line 65
    :cond_0
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1a

    if-lt p0, v0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;)Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a;
    .locals 1

    .line 1
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a;

    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->h:Lcom/sumsub/sns/internal/ml/autocapture/d;

    .line 3
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a;-><init>(Lcom/sumsub/sns/internal/ml/autocapture/d;)V

    return-object v0
.end method

.method public static final c(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;)Lkotlin/Unit;
    .locals 11

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->D:Z

    .line 2
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 3
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 4
    const-string v2, "DocCapture"

    const-string/jumbo v3, "photo animation finished"

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v3, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 5
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/U1;

    invoke-direct {v1, p0, v4}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/U1;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lkotlin/coroutines/Continuation;)V

    const/4 v2, 0x1

    invoke-static {p0, v0, v1, v2, v4}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 6
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v5

    new-instance v8, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/V1;

    invoke-direct {v8, p0, v4}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/V1;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lkotlin/coroutines/Continuation;)V

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 7
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final d(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;)Lkotlin/Unit;
    .locals 10

    .line 29
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->H:Lkotlinx/coroutines/flow/n;

    .line 30
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    const/4 v8, 0x0

    const/16 v9, 0x37

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v9}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/q1;Ljava/lang/Boolean;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z0;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e1;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p1;Lcom/sumsub/sns/core/presentation/base/m;I)Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 31
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 32
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->K:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->a(Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;)V

    .line 33
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->j:Landroidx/lifecycle/SavedStateHandle;

    const-string v1, "current_side"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 34
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "requestDocumentNextSide: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 35
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 36
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 37
    const-string v2, "DocCapture"

    invoke-virtual {v1, v2, v0, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 38
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/c2;

    invoke-direct {v0, v3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/c2;-><init>(Lkotlin/coroutines/Continuation;)V

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p0, v1, v0, v2, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 39
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final e()Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/I2;
    .locals 8

    .line 1
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/I2;->d:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/H2;

    .line 2
    sget-object v1, Lcom/sumsub/sns/internal/ff/a;->x:Lcom/sumsub/sns/internal/ff/core/a;

    .line 3
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/ff/core/a;->b()Lcom/sumsub/sns/internal/ff/core/c;

    move-result-object v1

    .line 4
    iget-object v1, v1, Lcom/sumsub/sns/internal/ff/core/c;->b:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 5
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/I2;

    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/I2;-><init>()V

    return-object v0

    .line 6
    :cond_0
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 7
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/I2;

    .line 8
    const-string/jumbo v3, "tiltAnimationCycleDurationSec"

    const-wide/high16 v4, 0x4008000000000000L    # 3.0

    invoke-virtual {v2, v3, v4, v5}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v6

    double-to-float v3, v6

    .line 9
    const-string/jumbo v6, "tiltAnimationNumberOfCycles"

    const/4 v7, 0x1

    .line 10
    invoke-virtual {v2, v6, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v6

    .line 11
    const-string/jumbo v7, "tiltWaitAfterAnimationSec"

    invoke-virtual {v2, v7, v4, v5}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v4

    double-to-float v2, v4

    .line 12
    invoke-direct {v1, v3, v6, v2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/I2;-><init>(FIF)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v1

    :catchall_0
    move-exception v1

    .line 13
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {v0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "Failed to parse w2AskToTiltDocumentOnSeamlessConfig FF"

    invoke-static {v0, v2, v1}, Lcom/sumsub/sns/internal/log/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 14
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/I2;

    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/I2;-><init>()V

    return-object v0
.end method

.method public static final e(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;)Lkotlin/Unit;
    .locals 10

    .line 46
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->H:Lkotlinx/coroutines/flow/n;

    .line 47
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    const/4 v8, 0x0

    const/16 v9, 0x37

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v9}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/q1;Ljava/lang/Boolean;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z0;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e1;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p1;Lcom/sumsub/sns/core/presentation/base/m;I)Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 48
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/k2;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/k2;-><init>(Lkotlin/coroutines/Continuation;)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {p0, v2, v0, v3, v1}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 49
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;Lcom/sumsub/sns/internal/ml/docdetector/a;Landroid/graphics/Bitmap;)Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/m1;
    .locals 4

    .line 316
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->T:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 317
    sget-boolean v0, Lcom/sumsub/sns/internal/core/common/k0;->f:Z

    if-eqz v0, :cond_0

    .line 318
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "started tracking document bounds: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 319
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 320
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 321
    const-string v3, "DocCapture"

    invoke-virtual {v2, v3, v0, v1}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    const/4 v0, 0x1

    .line 322
    iput-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->T:Z

    .line 323
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->h:Lcom/sumsub/sns/internal/ml/autocapture/d;

    .line 324
    iget-boolean v0, v0, Lcom/sumsub/sns/internal/ml/autocapture/d;->b:Z

    if-eqz v0, :cond_1

    .line 325
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/m1;

    .line 326
    new-instance v1, Landroid/util/Size;

    invoke-virtual {p3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-virtual {p3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p3

    invoke-direct {v1, v2, p3}, Landroid/util/Size;-><init>(II)V

    .line 327
    new-instance p3, Landroid/util/Size;

    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->f:Lcom/sumsub/sns/internal/ml/docdetector/d;

    .line 328
    iget-object v2, v2, Lcom/sumsub/sns/internal/ml/docdetector/d;->h:Lcom/sumsub/sns/internal/ml/autocapture/a;

    .line 329
    iget-object v2, v2, Lcom/sumsub/sns/internal/ml/autocapture/a;->d:Landroid/util/Size;

    .line 330
    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    move-result v2

    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->f:Lcom/sumsub/sns/internal/ml/docdetector/d;

    .line 331
    iget-object v3, v3, Lcom/sumsub/sns/internal/ml/docdetector/d;->h:Lcom/sumsub/sns/internal/ml/autocapture/a;

    .line 332
    iget-object v3, v3, Lcom/sumsub/sns/internal/ml/autocapture/a;->d:Landroid/util/Size;

    .line 333
    invoke-virtual {v3}, Landroid/util/Size;->getHeight()I

    move-result v3

    invoke-direct {p3, v2, v3}, Landroid/util/Size;-><init>(II)V

    .line 334
    iget-boolean p1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;->a:Z

    .line 335
    invoke-direct {v0, v1, p3, p2, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/m1;-><init>(Landroid/util/Size;Landroid/util/Size;Lcom/sumsub/sns/internal/ml/docdetector/a;Z)V

    return-object v0

    :cond_1
    return-object v1
.end method

.method public final a(Landroid/content/Context;Landroid/graphics/Bitmap;Landroid/graphics/Rect;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g1;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    instance-of v6, v5, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p2;

    if-eqz v6, :cond_0

    move-object v6, v5

    check-cast v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p2;

    iget v7, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p2;->g:I

    const/high16 v8, -0x80000000

    and-int v9, v7, v8

    if-eqz v9, :cond_0

    sub-int/2addr v7, v8

    iput v7, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p2;->g:I

    goto :goto_0

    :cond_0
    new-instance v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p2;

    invoke-direct {v6, v0, v5}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p2;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v5, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p2;->e:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v7

    .line 372
    iget v8, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p2;->g:I

    const-string v9, "current_side"

    const-string v10, "DocCapture"

    const/4 v11, 0x2

    const/4 v13, 0x0

    const/4 v14, 0x1

    if-eqz v8, :cond_3

    if-eq v8, v14, :cond_2

    if-ne v8, v11, :cond_1

    iget-object v1, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p2;->c:Ljava/lang/Object;

    check-cast v1, Ljava/io/File;

    iget-object v1, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p2;->b:Landroid/graphics/Bitmap;

    iget-object v2, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p2;->a:Ljava/lang/Object;

    check-cast v2, Landroid/graphics/Bitmap;

    invoke-static {v5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget v1, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p2;->d:I

    iget-object v2, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p2;->c:Ljava/lang/Object;

    check-cast v2, Landroid/graphics/Bitmap;

    iget-object v3, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p2;->b:Landroid/graphics/Bitmap;

    iget-object v4, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p2;->a:Ljava/lang/Object;

    check-cast v4, Landroid/content/Context;

    invoke-static {v5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v16, v3

    move v3, v1

    move-object v1, v4

    move-object v4, v5

    move-object v5, v2

    move-object/from16 v2, v16

    goto/16 :goto_4

    :cond_3
    invoke-static {v5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 373
    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->h:Lcom/sumsub/sns/internal/ml/autocapture/d;

    .line 374
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez v2, :cond_4

    .line 375
    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    move-result v5

    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    move-result v8

    .line 376
    sget-object v15, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 377
    invoke-static {v5, v8, v15}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 378
    new-instance v8, Landroid/graphics/Canvas;

    invoke-direct {v8, v5}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 379
    iget v15, v3, Landroid/graphics/Rect;->left:I

    mul-int/lit8 v15, v15, -0x1

    int-to-float v15, v15

    .line 380
    iget v3, v3, Landroid/graphics/Rect;->top:I

    mul-int/lit8 v3, v3, -0x1

    int-to-float v3, v3

    .line 381
    invoke-virtual {v8, v2, v15, v3, v13}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    goto :goto_1

    :cond_4
    move-object v5, v2

    :goto_1
    if-eqz v4, :cond_5

    .line 382
    iget-boolean v3, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g1;->b:Z

    if-ne v3, v14, :cond_5

    move v3, v14

    goto :goto_2

    :cond_5
    const/4 v3, 0x0

    .line 383
    :goto_2
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v15, "taking picture, photo quality result="

    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 384
    sget-object v8, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 385
    iget-object v8, v8, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 386
    invoke-virtual {v8, v10, v4, v13}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 387
    iget-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->j:Landroidx/lifecycle/SavedStateHandle;

    invoke-virtual {v4, v9}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    if-eqz v4, :cond_6

    .line 388
    invoke-virtual {v4}, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->getValue()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_6

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "_"

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_7

    :cond_6
    const-string v4, ""

    :cond_7
    if-eqz v3, :cond_8

    .line 389
    const-string v8, "autocapture_"

    goto :goto_3

    :cond_8
    move-object v8, v13

    :goto_3
    if-nez v8, :cond_9

    const-string v8, "manual_"

    :cond_9
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 390
    iput-object v1, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p2;->a:Ljava/lang/Object;

    iput-object v2, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p2;->b:Landroid/graphics/Bitmap;

    iput-object v5, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p2;->c:Ljava/lang/Object;

    iput v3, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p2;->d:I

    iput v14, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p2;->g:I

    .line 391
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    move-result-object v8

    new-instance v15, Lcom/sumsub/sns/internal/core/common/A0;

    invoke-direct {v15, v5, v4, v1, v13}, Lcom/sumsub/sns/internal/core/common/A0;-><init>(Landroid/graphics/Bitmap;Ljava/lang/String;Landroid/content/Context;Lkotlin/coroutines/Continuation;)V

    invoke-static {v8, v15, v6}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v7, :cond_a

    goto :goto_7

    .line 392
    :cond_a
    :goto_4
    check-cast v4, Ljava/io/File;

    if-eqz v4, :cond_d

    if-eqz v3, :cond_b

    move v8, v14

    goto :goto_5

    :cond_b
    const/4 v8, 0x0

    .line 393
    :goto_5
    iget-object v15, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->j:Landroidx/lifecycle/SavedStateHandle;

    invoke-virtual {v15, v9}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 394
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v12, "picture taken, isAutoCaptured="

    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v8, ". Side - "

    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 395
    sget-object v9, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 396
    iget-object v9, v9, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 397
    invoke-virtual {v9, v10, v8, v13}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    if-eqz v3, :cond_c

    move v12, v14

    goto :goto_6

    :cond_c
    const/4 v12, 0x0

    .line 398
    :goto_6
    iput-object v2, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p2;->a:Ljava/lang/Object;

    iput-object v5, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p2;->b:Landroid/graphics/Bitmap;

    iput-object v4, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p2;->c:Ljava/lang/Object;

    iput v11, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p2;->g:I

    invoke-virtual {v0, v1, v4, v12, v6}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->a(Landroid/content/Context;Ljava/io/File;ZLcom/sumsub/sns/internal/features/presentation/camera/photo/document/p2;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v7, :cond_d

    :goto_7
    return-object v7

    :cond_d
    move-object v1, v5

    .line 399
    :goto_8
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    .line 400
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 401
    :cond_e
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

.method public final a(Landroid/content/Context;Landroid/graphics/Bitmap;Landroid/graphics/Rect;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p4

    instance-of v4, v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J1;

    if-eqz v4, :cond_0

    move-object v4, v3

    check-cast v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J1;

    iget v5, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J1;->i:I

    const/high16 v6, -0x80000000

    and-int v7, v5, v6

    if-eqz v7, :cond_0

    sub-int/2addr v5, v6

    iput v5, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J1;->i:I

    goto :goto_0

    :cond_0
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J1;

    invoke-direct {v4, v0, v3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J1;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v3, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J1;->g:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v5

    .line 191
    iget v6, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J1;->i:I

    const-string v7, " ms"

    const/4 v8, 0x5

    const/4 v9, 0x4

    const/4 v10, 0x3

    const/4 v11, 0x2

    const-string v12, "DocCapture"

    const/4 v13, 0x1

    const/4 v14, 0x0

    const/4 v15, 0x0

    if-eqz v6, :cond_6

    if-eq v6, v13, :cond_5

    if-eq v6, v11, :cond_4

    if-eq v6, v10, :cond_3

    if-eq v6, v9, :cond_2

    if-ne v6, v8, :cond_1

    iget-object v1, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J1;->a:Ljava/lang/Object;

    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$FrameHandleResult;

    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    return-object v1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J1;->c:Ljava/lang/Object;

    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$PhotoCheckResult;

    iget-object v2, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J1;->b:Ljava/lang/Object;

    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$FrameHandleResult;

    iget-object v6, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J1;->a:Ljava/lang/Object;

    check-cast v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;

    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_e

    :cond_3
    iget v1, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J1;->f:I

    iget v2, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J1;->e:I

    iget-object v6, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J1;->c:Ljava/lang/Object;

    check-cast v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;

    iget-object v10, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J1;->b:Ljava/lang/Object;

    check-cast v10, Landroid/graphics/Rect;

    iget-object v11, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J1;->a:Ljava/lang/Object;

    check-cast v11, Landroid/content/Context;

    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_4
    iget-wide v1, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J1;->d:J

    iget-object v6, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J1;->c:Ljava/lang/Object;

    check-cast v6, Landroid/graphics/Rect;

    iget-object v11, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J1;->b:Ljava/lang/Object;

    check-cast v11, Landroid/graphics/Bitmap;

    iget-object v8, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J1;->a:Ljava/lang/Object;

    check-cast v8, Landroid/content/Context;

    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-wide v9, v1

    move-object v1, v8

    goto/16 :goto_2

    :cond_5
    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_6
    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 192
    iget-boolean v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->r:Z

    if-eqz v3, :cond_7

    .line 193
    iput-boolean v14, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->r:Z

    .line 194
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v16

    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/K1;

    invoke-direct {v3, v0, v15}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/K1;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lkotlin/coroutines/Continuation;)V

    const/16 v20, 0x3

    const/16 v21, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v19, v3

    invoke-static/range {v16 .. v21}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 195
    :cond_7
    iget-boolean v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->p:Z

    if-eqz v3, :cond_8

    .line 196
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$FrameHandleResult;->RELEASED:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$FrameHandleResult;

    return-object v1

    .line 197
    :cond_8
    iget-boolean v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->Q:Z

    if-eqz v3, :cond_9

    .line 198
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$PhotoCheckResult;->SKIPPED:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$PhotoCheckResult;

    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$PhotoCheckResult;)V

    .line 199
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$FrameHandleResult;->RELEASED:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$FrameHandleResult;

    return-object v1

    .line 200
    :cond_9
    iget-boolean v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->I:Z

    if-eqz v3, :cond_b

    .line 201
    iput v13, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J1;->i:I

    invoke-virtual {v0, v1, v2, v4}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->b(Landroid/content/Context;Landroid/graphics/Bitmap;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v5, :cond_a

    goto/16 :goto_f

    .line 202
    :cond_a
    :goto_1
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$PhotoCheckResult;->CAPTURED:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$PhotoCheckResult;

    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$PhotoCheckResult;)V

    .line 203
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$FrameHandleResult;->RELEASED:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$FrameHandleResult;

    return-object v1

    .line 204
    :cond_b
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->H:Lkotlinx/coroutines/flow/n;

    .line 205
    invoke-interface {v3}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    .line 206
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;->b:Ljava/lang/Boolean;

    .line 207
    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    .line 208
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$PhotoCheckResult;->SKIPPED:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$PhotoCheckResult;

    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$PhotoCheckResult;)V

    .line 209
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$FrameHandleResult;->RELEASED:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$FrameHandleResult;

    return-object v1

    .line 210
    :cond_c
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->f:Lcom/sumsub/sns/internal/ml/docdetector/d;

    .line 211
    iget-boolean v3, v3, Lcom/sumsub/sns/internal/ml/core/h;->f:Z

    if-eqz v3, :cond_d

    .line 212
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v16

    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/n2;

    invoke-direct {v1, v0, v15}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/n2;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lkotlin/coroutines/Continuation;)V

    const/16 v20, 0x3

    const/16 v21, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v19, v1

    invoke-static/range {v16 .. v21}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 213
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$PhotoCheckResult;->SKIPPED:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$PhotoCheckResult;

    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$PhotoCheckResult;)V

    .line 214
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$FrameHandleResult;->RELEASED:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$FrameHandleResult;

    return-object v1

    .line 215
    :cond_d
    iget-boolean v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->Q:Z

    if-nez v3, :cond_23

    iget-boolean v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->A:Z

    if-eqz v3, :cond_e

    goto/16 :goto_10

    .line 216
    :cond_e
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    .line 217
    invoke-static {}, Lkotlinx/coroutines/z0;->a()Lkotlinx/coroutines/j0;

    move-result-object v8

    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/L1;

    invoke-direct {v3, v0, v2, v15}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/L1;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)V

    iput-object v1, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J1;->a:Ljava/lang/Object;

    iput-object v2, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J1;->b:Ljava/lang/Object;

    move-object/from16 v6, p3

    iput-object v6, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J1;->c:Ljava/lang/Object;

    iput-wide v9, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J1;->d:J

    iput v11, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J1;->i:I

    invoke-static {v8, v3, v4}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v5, :cond_f

    goto/16 :goto_f

    :cond_f
    move-object v11, v2

    .line 218
    :goto_2
    check-cast v3, Lcom/sumsub/sns/internal/ml/docdetector/a;

    if-eqz v3, :cond_10

    .line 219
    invoke-virtual {v11}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-float v2, v2

    iget-object v8, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->f:Lcom/sumsub/sns/internal/ml/docdetector/d;

    .line 220
    iget-object v8, v8, Lcom/sumsub/sns/internal/ml/docdetector/d;->h:Lcom/sumsub/sns/internal/ml/autocapture/a;

    .line 221
    iget-object v8, v8, Lcom/sumsub/sns/internal/ml/autocapture/a;->d:Landroid/util/Size;

    .line 222
    invoke-virtual {v8}, Landroid/util/Size;->getWidth()I

    move-result v8

    int-to-float v8, v8

    div-float/2addr v2, v8

    .line 223
    invoke-virtual {v11}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    int-to-float v8, v8

    iget-object v13, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->f:Lcom/sumsub/sns/internal/ml/docdetector/d;

    .line 224
    iget-object v13, v13, Lcom/sumsub/sns/internal/ml/docdetector/d;->h:Lcom/sumsub/sns/internal/ml/autocapture/a;

    .line 225
    iget-object v13, v13, Lcom/sumsub/sns/internal/ml/autocapture/a;->d:Landroid/util/Size;

    .line 226
    invoke-virtual {v13}, Landroid/util/Size;->getHeight()I

    move-result v13

    int-to-float v13, v13

    div-float/2addr v8, v13

    .line 227
    iget-object v13, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->y:Lkotlin/Lazy;

    invoke-interface {v13}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a;

    .line 228
    invoke-virtual {v13, v2, v8, v6, v3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a;->a(FFLandroid/graphics/Rect;Lcom/sumsub/sns/internal/ml/docdetector/a;)Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;

    move-result-object v2

    goto :goto_3

    :cond_10
    move-object v2, v15

    :goto_3
    if-eqz v2, :cond_11

    if-eqz v3, :cond_11

    .line 229
    invoke-virtual {v0, v2, v3, v11}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;Lcom/sumsub/sns/internal/ml/docdetector/a;Landroid/graphics/Bitmap;)Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/m1;

    move-result-object v3

    if-eqz v3, :cond_12

    .line 230
    invoke-virtual {v0, v3}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    goto :goto_4

    .line 231
    :cond_11
    iget-boolean v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->T:Z

    if-eqz v3, :cond_12

    .line 232
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 233
    iget-object v3, v3, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 234
    const-string v8, "lost document bounds"

    invoke-virtual {v3, v12, v8, v15}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 235
    iput-boolean v14, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->T:Z

    .line 236
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->y:Lkotlin/Lazy;

    invoke-interface {v3}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a;

    .line 237
    iput-boolean v14, v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a;->c:Z

    .line 238
    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/f1;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/f1;

    invoke-virtual {v0, v3}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 239
    :cond_12
    :goto_4
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->S:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a1;

    if-eqz v3, :cond_13

    const/4 v8, 0x1

    goto :goto_5

    :cond_13
    move v8, v14

    :goto_5
    if-eqz v2, :cond_14

    .line 240
    iget-boolean v13, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;->a:Z

    const/4 v14, 0x1

    if-ne v13, v14, :cond_14

    .line 241
    iget-object v13, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;->b:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/CheckDetectionResult$SizeCheckResult;

    .line 242
    sget-object v14, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/CheckDetectionResult$SizeCheckResult;->OK:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/CheckDetectionResult$SizeCheckResult;

    if-ne v13, v14, :cond_14

    const/4 v13, 0x1

    goto :goto_6

    :cond_14
    const/4 v13, 0x0

    :goto_6
    if-eqz v13, :cond_16

    .line 243
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v20

    sub-long v9, v20, v9

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "docDetector took "

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 244
    sget-object v9, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 245
    iget-object v9, v9, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 246
    invoke-virtual {v9, v12, v3, v15}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 247
    iput-object v1, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J1;->a:Ljava/lang/Object;

    iput-object v6, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J1;->b:Ljava/lang/Object;

    iput-object v2, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J1;->c:Ljava/lang/Object;

    iput v8, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J1;->e:I

    iput v13, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J1;->f:I

    const/4 v3, 0x3

    iput v3, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J1;->i:I

    invoke-virtual {v0, v1, v11, v4}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->a(Landroid/content/Context;Landroid/graphics/Bitmap;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v5, :cond_15

    goto/16 :goto_f

    :cond_15
    move-object v11, v1

    move-object v10, v6

    move v1, v13

    move-object v6, v2

    move v2, v8

    :goto_7
    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    move v13, v1

    move v8, v2

    move-object v1, v11

    goto :goto_8

    :cond_16
    const/4 v9, 0x0

    .line 248
    iput-boolean v9, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->N:Z

    if-eqz v3, :cond_17

    .line 249
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a1;->a:Landroid/graphics/Bitmap;

    if-eqz v3, :cond_17

    .line 250
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V

    .line 251
    :cond_17
    iput-object v15, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->S:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a1;

    move-object v10, v6

    const/4 v3, 0x0

    move-object v6, v2

    :goto_8
    if-eqz v3, :cond_18

    .line 252
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$FrameHandleResult;->TAKEN:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$FrameHandleResult;

    goto :goto_9

    .line 253
    :cond_18
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$FrameHandleResult;->RELEASED:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$FrameHandleResult;

    .line 254
    :goto_9
    sget-object v9, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$PhotoCheckResult;->SKIPPED:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$PhotoCheckResult;

    if-eqz v13, :cond_21

    if-eqz v3, :cond_19

    if-nez v8, :cond_19

    .line 255
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->O:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$PhotoCheckResult;

    sget-object v8, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$PhotoCheckResult;->FOCUSING:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$PhotoCheckResult;

    if-ne v3, v8, :cond_19

    const/4 v14, 0x1

    goto :goto_a

    :cond_19
    const/4 v14, 0x0

    .line 256
    :goto_a
    iget-boolean v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->N:Z

    if-eqz v3, :cond_1b

    if-eqz v14, :cond_1a

    goto :goto_b

    :cond_1a
    const/4 v14, 0x1

    goto :goto_c

    .line 257
    :cond_1b
    :goto_b
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 258
    iget-object v3, v3, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 259
    const-string/jumbo v8, "started waiting for better photo"

    invoke-virtual {v3, v12, v8, v15}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 260
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    iput-wide v8, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->M:J

    const/4 v14, 0x1

    .line 261
    iput-boolean v14, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->N:Z

    .line 262
    :goto_c
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    iget-wide v14, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->M:J

    sub-long/2addr v8, v14

    .line 263
    iget-boolean v11, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->N:Z

    if-eqz v11, :cond_1c

    .line 264
    iget-object v11, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->h:Lcom/sumsub/sns/internal/ml/autocapture/d;

    .line 265
    iget-wide v13, v11, Lcom/sumsub/sns/internal/ml/autocapture/d;->c:J

    cmp-long v11, v8, v13

    if-ltz v11, :cond_1c

    const/4 v13, 0x1

    goto :goto_d

    :cond_1c
    const/4 v13, 0x0

    :goto_d
    if-eqz v13, :cond_1f

    .line 266
    iget-object v11, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->O:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$PhotoCheckResult;

    sget-object v14, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$PhotoCheckResult;->FOCUSING:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$PhotoCheckResult;

    if-eq v11, v14, :cond_1f

    const/4 v11, 0x0

    .line 267
    iput-boolean v11, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->N:Z

    .line 268
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v13, "timeout waiting for better photo after: "

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 269
    sget-object v8, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 270
    iget-object v8, v8, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    const/4 v3, 0x0

    .line 271
    invoke-virtual {v8, v12, v7, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 272
    iget-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->S:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a1;

    if-eqz v7, :cond_1e

    .line 273
    iput-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->S:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a1;

    .line 274
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$PhotoCheckResult;->CAPTURED:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$PhotoCheckResult;

    .line 275
    sget-object v8, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$FrameHandleResult;->RELEASED:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$FrameHandleResult;

    .line 276
    iput-object v6, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J1;->a:Ljava/lang/Object;

    iput-object v8, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J1;->b:Ljava/lang/Object;

    iput-object v2, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J1;->c:Ljava/lang/Object;

    const/4 v9, 0x4

    iput v9, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J1;->i:I

    invoke-virtual {v0, v1, v10, v7, v4}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->a(Landroid/content/Context;Landroid/graphics/Rect;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a1;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J1;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v5, :cond_1d

    goto :goto_f

    :cond_1d
    move-object v1, v2

    move-object v2, v8

    goto :goto_e

    :cond_1e
    move-object v1, v14

    goto :goto_e

    :cond_1f
    if-eqz v13, :cond_20

    .line 277
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$PhotoCheckResult;->FOCUSING:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$PhotoCheckResult;

    goto :goto_e

    .line 278
    :cond_20
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$PhotoCheckResult;->WAITING:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$PhotoCheckResult;

    goto :goto_e

    :cond_21
    move-object v1, v9

    .line 279
    :goto_e
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$PhotoCheckResult;)V

    .line 280
    iput-object v2, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J1;->a:Ljava/lang/Object;

    const/4 v3, 0x0

    iput-object v3, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J1;->b:Ljava/lang/Object;

    iput-object v3, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J1;->c:Ljava/lang/Object;

    const/4 v3, 0x5

    iput v3, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J1;->i:I

    invoke-virtual {v0, v6, v1, v4}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$PhotoCheckResult;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v5, :cond_22

    :goto_f
    return-object v5

    :cond_22
    return-object v2

    .line 281
    :cond_23
    :goto_10
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$PhotoCheckResult;->SKIPPED:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$PhotoCheckResult;

    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$PhotoCheckResult;)V

    .line 282
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$FrameHandleResult;->RELEASED:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$FrameHandleResult;

    return-object v1
.end method

.method public final a(Landroid/content/Context;Landroid/graphics/Bitmap;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/y1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/y1;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/y1;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/y1;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/y1;

    invoke-direct {v0, p0, p3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/y1;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/y1;->c:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 300
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/y1;->e:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/y1;->b:Landroid/graphics/Bitmap;

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/y1;->a:Landroid/content/Context;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 301
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/y1;->a:Landroid/content/Context;

    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/y1;->b:Landroid/graphics/Bitmap;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/y1;->e:I

    .line 302
    invoke-virtual {p0, p2, v3, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->a(Landroid/graphics/Bitmap;ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    .line 303
    :cond_3
    :goto_1
    check-cast p3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g1;

    if-eqz p3, :cond_4

    .line 304
    iget-object v0, p3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g1;->a:Ljava/lang/Float;

    if-eqz v0, :cond_4

    .line 305
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_2

    :cond_4
    const/high16 v0, -0x40800000    # -1.0f

    .line 306
    :goto_2
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->g:Lcom/sumsub/sns/internal/ml/badphotos/e;

    .line 307
    iget v1, v1, Lcom/sumsub/sns/internal/ml/badphotos/e;->b:F

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_5

    if-eqz p3, :cond_5

    .line 308
    invoke-virtual {p0, p1, p2, p3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->a(Landroid/content/Context;Landroid/graphics/Bitmap;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g1;)Z

    move-result v3

    .line 309
    :cond_5
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final a(Landroid/content/Context;Landroid/graphics/Rect;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a1;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J1;)Ljava/lang/Object;
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x7

    const/4 v2, 0x0

    .line 293
    invoke-static {v2, v0, v0, v1, v0}, Lkotlinx/coroutines/channels/g;->b(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lkotlinx/coroutines/channels/d;

    move-result-object v8

    const/4 v0, 0x1

    .line 294
    iput-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->D:Z

    .line 295
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/n1;

    .line 296
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d3;

    move-object v4, p0

    move-object v5, p1

    move-object v7, p2

    move-object v6, p3

    invoke-direct/range {v3 .. v8}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d3;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Landroid/content/Context;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a1;Landroid/graphics/Rect;Lkotlinx/coroutines/channels/d;)V

    .line 297
    invoke-direct {v0, v3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/n1;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 298
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 299
    invoke-interface {v8, p4}, Lkotlinx/coroutines/channels/o;->D(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Landroid/content/Context;Ljava/io/File;ZLcom/sumsub/sns/internal/features/presentation/camera/photo/document/p2;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p4

    .line 33
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->j:Landroidx/lifecycle/SavedStateHandle;

    const-string v4, "current_side"

    invoke-virtual {v3, v4}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 34
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Picture is taken. Side - "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 35
    sget-object v5, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 36
    iget-object v5, v5, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 37
    const-string v6, "DocCapture"

    const/4 v7, 0x0

    invoke-virtual {v5, v6, v3, v7}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 38
    new-instance v8, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 39
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->j:Landroidx/lifecycle/SavedStateHandle;

    invoke-virtual {v3, v4}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    move-object v13, v3

    check-cast v13, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 40
    invoke-static/range {p3 .. p3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v14

    const/4 v15, 0x0

    const/16 v16, 0x3ac

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v10, p2

    move-object/from16 v9, p2

    .line 41
    invoke-direct/range {v8 .. v16}, Lcom/sumsub/sns/internal/features/data/model/common/T;-><init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;Ljava/lang/Boolean;Lcom/sumsub/sns/internal/features/data/model/common/S;I)V

    .line 42
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->h()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v3

    .line 43
    invoke-interface {v3, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 44
    iget-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->q:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v5, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->U:[Lkotlin/reflect/KProperty;

    const/4 v6, 0x0

    aget-object v5, v5, v6

    .line 45
    iget-object v5, v4, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    iget-object v4, v4, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v5, v4, v3}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 46
    iget-boolean v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->L:Z

    const/4 v4, 0x1

    if-nez v3, :cond_1

    .line 47
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->k:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    if-eqz v1, :cond_0

    .line 48
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v9

    new-instance v12, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/A1;

    invoke-direct {v12, v0, v1, v8, v7}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/A1;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lcom/sumsub/sns/internal/features/presentation/utils/M;Lcom/sumsub/sns/internal/features/data/model/common/T;Lkotlin/coroutines/Continuation;)V

    const/4 v13, 0x3

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v9 .. v14}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    goto :goto_0

    .line 49
    :cond_0
    invoke-virtual {v0, v4}, Lcom/sumsub/sns/core/presentation/base/C;->showProgress(Z)V

    const/16 v5, 0xd

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, v8

    .line 50
    invoke-static/range {v0 .. v6}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    .line 51
    :goto_0
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 52
    :cond_1
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->K:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_5

    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->K:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->h()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-gt v3, v5, :cond_2

    goto :goto_1

    .line 53
    :cond_2
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->h()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ne v3, v4, :cond_4

    .line 54
    invoke-virtual {v0, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->a(Landroid/content/Context;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_3

    return-object v1

    .line 55
    :cond_3
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 56
    :cond_4
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v2

    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Q1;

    invoke-direct {v5, v0, v7}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Q1;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 57
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 58
    :cond_5
    :goto_1
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->h()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ne v3, v4, :cond_7

    .line 59
    invoke-virtual {v0, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->b(Landroid/content/Context;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_6

    return-object v1

    .line 60
    :cond_6
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 61
    :cond_7
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v2

    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P1;

    invoke-direct {v5, v0, v7}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P1;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 62
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

.method public final a(Landroid/content/Context;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/H1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/H1;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/H1;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/H1;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/H1;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/H1;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/H1;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 402
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/H1;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlinx/coroutines/channels/ChannelResult;

    invoke-virtual {p2}, Lkotlinx/coroutines/channels/ChannelResult;->l()Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 403
    iput-boolean v3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->Q:Z

    .line 404
    iget-boolean p2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->L:Z

    if-eqz p2, :cond_3

    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->z:Ljava/io/File;

    if-nez p2, :cond_3

    .line 405
    iput-boolean v3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->p:Z

    .line 406
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->a(Landroid/content/Context;)V

    .line 407
    :cond_3
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->P:Lkotlinx/coroutines/channels/d;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/H1;->c:I

    invoke-interface {p1, v0}, Lkotlinx/coroutines/channels/o;->p(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    .line 408
    :cond_4
    :goto_1
    invoke-static {p1}, Lkotlinx/coroutines/channels/ChannelResult;->i(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 409
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 410
    :cond_5
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v0

    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/I1;

    const/4 p1, 0x0

    invoke-direct {v3, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/I1;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 411
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Landroid/graphics/Bitmap;ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/w1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/w1;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/w1;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/w1;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/w1;

    invoke-direct {v0, p0, p3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/w1;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/w1;->c:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 442
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/w1;->e:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-wide p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/w1;->b:J

    iget-boolean v0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/w1;->a:Z

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 443
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 444
    iget-boolean p3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->E:Z

    if-eqz p3, :cond_4

    .line 445
    invoke-static {}, Lkotlinx/coroutines/z0;->a()Lkotlinx/coroutines/j0;

    move-result-object p3

    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/x1;

    invoke-direct {v2, p0, p1, v4}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/x1;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)V

    iput-boolean p2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/w1;->a:Z

    iput-wide v5, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/w1;->b:J

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/w1;->e:I

    invoke-static {p3, v2, v0}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    move v0, p2

    move-wide p1, v5

    :goto_1
    check-cast p3, Lcom/sumsub/sns/internal/ml/core/n;

    move-wide v5, p1

    move p2, v0

    goto :goto_2

    .line 446
    :cond_4
    new-instance p3, Lcom/sumsub/sns/internal/ml/core/k;

    invoke-direct {p3}, Lcom/sumsub/sns/internal/ml/core/k;-><init>()V

    .line 447
    :goto_2
    instance-of p1, p3, Lcom/sumsub/sns/internal/ml/core/l;

    if-eqz p1, :cond_5

    move-object v0, p3

    check-cast v0, Lcom/sumsub/sns/internal/ml/core/l;

    goto :goto_3

    :cond_5
    move-object v0, v4

    .line 448
    :goto_3
    iget-boolean v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->C:Z

    const-string v2, "DocCapture"

    if-nez v1, :cond_6

    .line 449
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "badPhotos result: "

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 450
    sget-object v7, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 451
    iget-object v7, v7, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 452
    invoke-virtual {v7, v2, v1, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    if-eqz v0, :cond_7

    .line 453
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    sub-long/2addr v7, v5

    .line 454
    iget-object v1, v0, Lcom/sumsub/sns/internal/ml/core/l;->a:Ljava/lang/Object;

    .line 455
    check-cast v1, Lcom/sumsub/sns/internal/ml/badphotos/models/a;

    .line 456
    iget v1, v1, Lcom/sumsub/sns/internal/ml/badphotos/models/a;->a:F

    .line 457
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "badPhotoDetector took "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v6, " ms, score="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 458
    sget-object v5, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 459
    iget-object v5, v5, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 460
    invoke-virtual {v5, v2, v1, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 461
    iget-object v1, v0, Lcom/sumsub/sns/internal/ml/core/l;->a:Ljava/lang/Object;

    .line 462
    check-cast v1, Lcom/sumsub/sns/internal/ml/badphotos/models/a;

    .line 463
    iget v1, v1, Lcom/sumsub/sns/internal/ml/badphotos/models/a;->a:F

    goto :goto_4

    :cond_7
    const/high16 v1, -0x40800000    # -1.0f

    .line 464
    :goto_4
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->g:Lcom/sumsub/sns/internal/ml/badphotos/e;

    .line 465
    iget v2, v2, Lcom/sumsub/sns/internal/ml/badphotos/e;->b:F

    cmpl-float v2, v1, v2

    if-ltz v2, :cond_8

    move v2, v3

    goto :goto_5

    :cond_8
    const/4 v2, 0x0

    .line 466
    :goto_5
    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/o1;

    if-eqz p1, :cond_9

    .line 467
    check-cast p3, Lcom/sumsub/sns/internal/ml/core/l;

    goto :goto_6

    :cond_9
    move-object p3, v4

    :goto_6
    if-eqz p3, :cond_a

    .line 468
    iget-object p1, p3, Lcom/sumsub/sns/internal/ml/core/l;->a:Ljava/lang/Object;

    .line 469
    check-cast p1, Lcom/sumsub/sns/internal/ml/badphotos/models/a;

    if-eqz p1, :cond_a

    .line 470
    iget-wide v6, p1, Lcom/sumsub/sns/internal/ml/badphotos/models/a;->b:J

    goto :goto_7

    :cond_a
    const-wide/16 v6, -0x1

    .line 471
    :goto_7
    invoke-direct {v5, v2, v1, v6, v7}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/o1;-><init>(ZFJ)V

    .line 472
    invoke-virtual {p0, v5}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 473
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g1;

    if-eqz v0, :cond_b

    .line 474
    iget-object p3, v0, Lcom/sumsub/sns/internal/ml/core/l;->a:Ljava/lang/Object;

    .line 475
    check-cast p3, Lcom/sumsub/sns/internal/ml/badphotos/models/a;

    if-eqz p3, :cond_b

    .line 476
    iget p3, p3, Lcom/sumsub/sns/internal/ml/badphotos/models/a;->a:F

    .line 477
    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxFloat(F)Ljava/lang/Float;

    move-result-object p3

    goto :goto_8

    :cond_b
    move-object p3, v4

    .line 478
    :goto_8
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->g:Lcom/sumsub/sns/internal/ml/badphotos/e;

    .line 479
    iget v2, v0, Lcom/sumsub/sns/internal/ml/badphotos/e;->c:F

    .line 480
    iget v0, v0, Lcom/sumsub/sns/internal/ml/badphotos/e;->b:F

    .line 481
    invoke-direct {p1, p3, v3, v2, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g1;-><init>(Ljava/lang/Float;ZFF)V

    const/4 p3, 0x0

    cmpl-float p3, v1, p3

    if-gtz p3, :cond_d

    if-eqz p2, :cond_c

    goto :goto_9

    :cond_c
    return-object v4

    :cond_d
    :goto_9
    return-object p1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$PhotoCheckResult;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u2;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u2;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u2;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u2;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u2;

    invoke-direct {v0, p0, p3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u2;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u2;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 283
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u2;->c:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_5

    if-eq v2, v6, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_4

    :cond_3
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_4
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    const/4 p3, 0x0

    if-nez p1, :cond_7

    .line 284
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;

    .line 285
    sget-object p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/CheckDetectionResult$SizeCheckResult;->SMALL:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/CheckDetectionResult$SizeCheckResult;

    .line 286
    invoke-direct {p1, p3, p2, p3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;-><init>(ZLcom/sumsub/sns/internal/features/presentation/camera/photo/document/CheckDetectionResult$SizeCheckResult;Z)V

    .line 287
    iput v6, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u2;->c:I

    invoke-virtual {p0, p1, p3, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_6

    goto :goto_5

    :cond_6
    :goto_1
    check-cast p3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z0;

    :goto_2
    move-object v3, p3

    goto :goto_7

    .line 288
    :cond_7
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$PhotoCheckResult;->SKIPPED:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$PhotoCheckResult;

    if-ne p2, v2, :cond_9

    iput v5, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u2;->c:I

    invoke-virtual {p0, p1, p3, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_8

    goto :goto_5

    :cond_8
    :goto_3
    check-cast p3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z0;

    goto :goto_2

    .line 289
    :cond_9
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$PhotoCheckResult;->FOCUSING:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$PhotoCheckResult;

    if-ne p2, v2, :cond_b

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u2;->c:I

    invoke-virtual {p0, p1, v6, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_a

    goto :goto_5

    :cond_a
    :goto_4
    check-cast p3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z0;

    goto :goto_2

    .line 290
    :cond_b
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$PhotoCheckResult;->WAITING:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$PhotoCheckResult;

    if-ne p2, v2, :cond_d

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u2;->c:I

    invoke-virtual {p0, p1, p3, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_c

    :goto_5
    return-object v1

    :cond_c
    :goto_6
    check-cast p3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z0;

    goto :goto_2

    :cond_d
    const/4 p3, 0x0

    goto :goto_2

    :goto_7
    if-eqz v3, :cond_e

    .line 291
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->H:Lkotlinx/coroutines/flow/n;

    invoke-interface {p1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    const/4 v6, 0x0

    const/16 v7, 0x3b

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/q1;Ljava/lang/Boolean;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z0;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e1;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p1;Lcom/sumsub/sns/core/presentation/base/m;I)Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    move-result-object p2

    invoke-interface {p1, p2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 292
    :cond_e
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u1;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u1;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u1;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u1;

    invoke-direct {v0, p0, p3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u1;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u1;->c:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 336
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u1;->e:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    const-string v5, " "

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u1;->b:I

    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u1;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_1
    iget p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u1;->b:I

    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u1;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_2
    iget p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u1;->b:I

    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u1;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_3
    iget p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u1;->b:I

    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u1;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_4
    iget p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u1;->b:I

    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u1;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_5
    iget p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u1;->b:I

    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u1;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_6
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 337
    sget-object p3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State;->INVALID:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State;

    .line 338
    iget-boolean v2, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;->a:Z

    const-string/jumbo v6, "sns_autocapture_hint_moveOut"

    if-eqz v2, :cond_a

    .line 339
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;->b:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/CheckDetectionResult$SizeCheckResult;

    .line 340
    sget-object p3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t1;->c:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p3, p1

    const/4 p3, 0x2

    if-eq p1, v4, :cond_6

    const/4 p2, 0x3

    if-eq p1, p3, :cond_4

    if-ne p1, p2, :cond_3

    .line 341
    sget-object p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State;->INTERMEDIATE:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State;

    .line 342
    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u1;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u1;->b:I

    const/4 p1, 0x4

    iput p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u1;->e:I

    invoke-virtual {p0, v6, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_1

    goto/16 :goto_6

    :cond_1
    move p1, v3

    :goto_1
    check-cast p3, Ljava/lang/String;

    if-nez p3, :cond_2

    goto/16 :goto_8

    :cond_2
    move-object v5, p3

    goto/16 :goto_8

    .line 343
    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 344
    :cond_4
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State;->INTERMEDIATE:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State;

    .line 345
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u1;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u1;->b:I

    iput p2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u1;->e:I

    const-string/jumbo p2, "sns_autocapture_hint_moveIn"

    invoke-virtual {p0, p2, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_5

    goto/16 :goto_6

    :cond_5
    move-object p2, p1

    move p1, v3

    :goto_2
    check-cast p3, Ljava/lang/String;

    if-nez p3, :cond_2

    goto/16 :goto_8

    .line 346
    :cond_6
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State;->OK:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State;

    if-eqz p2, :cond_8

    .line 347
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u1;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u1;->b:I

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u1;->e:I

    const-string/jumbo p2, "sns_autocapture_hint_keepFocusing"

    invoke-virtual {p0, p2, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_7

    goto :goto_6

    :cond_7
    move-object p2, p1

    move p1, v3

    :goto_3
    check-cast p3, Ljava/lang/String;

    if-nez p3, :cond_2

    goto :goto_8

    .line 348
    :cond_8
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u1;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u1;->b:I

    iput p3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u1;->e:I

    const-string/jumbo p2, "sns_autocapture_hint_holdLikeThis"

    invoke-virtual {p0, p2, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_9

    goto :goto_6

    :cond_9
    move-object p2, p1

    move p1, v4

    :goto_4
    check-cast p3, Ljava/lang/String;

    if-nez p3, :cond_2

    goto :goto_8

    .line 349
    :cond_a
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;->b:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/CheckDetectionResult$SizeCheckResult;

    .line 350
    sget-object p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/CheckDetectionResult$SizeCheckResult;->BIG:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/CheckDetectionResult$SizeCheckResult;

    if-ne p1, p2, :cond_c

    .line 351
    sget-object p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State;->INTERMEDIATE:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State;

    .line 352
    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u1;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u1;->b:I

    const/4 p1, 0x5

    iput p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u1;->e:I

    invoke-virtual {p0, v6, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_b

    goto :goto_6

    :cond_b
    move p1, v3

    :goto_5
    check-cast p3, Ljava/lang/String;

    if-nez p3, :cond_2

    goto :goto_8

    .line 353
    :cond_c
    iput-object p3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u1;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u1;->b:I

    const/4 p1, 0x6

    iput p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u1;->e:I

    const-string/jumbo p1, "sns_autocapture_hint_targetAt"

    invoke-virtual {p0, p1, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_d

    :goto_6
    return-object v1

    :cond_d
    move-object p2, p3

    move-object p3, p1

    move p1, v3

    :goto_7
    check-cast p3, Ljava/lang/String;

    if-nez p3, :cond_2

    .line 354
    :goto_8
    new-instance p3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z0;

    if-eqz p1, :cond_e

    move v3, v4

    :cond_e
    invoke-direct {p3, v5, v3, p2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z0;-><init>(Ljava/lang/String;ZLcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State;)V

    return-object p3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/utils/M;Lcom/sumsub/sns/internal/features/data/model/common/T;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/z1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/z1;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/z1;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/z1;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/z1;

    invoke-direct {v0, p0, p3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/z1;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/z1;->c:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 146
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/z1;->e:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_5

    if-eq v2, v6, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_3
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/z1;->b:Lcom/sumsub/sns/internal/features/data/model/common/T;

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/z1;->a:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 147
    iget-object p3, p2, Lcom/sumsub/sns/internal/features/data/model/common/T;->e:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 148
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "camera side captured, side="

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    .line 149
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 150
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 151
    const-string v8, "DocCapture"

    invoke-virtual {v2, v8, p3, v7}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 152
    iput-boolean v6, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->Q:Z

    .line 153
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/z1;->a:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/z1;->b:Lcom/sumsub/sns/internal/features/data/model/common/T;

    iput v6, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/z1;->e:I

    invoke-virtual {p1, p2, v0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(Lcom/sumsub/sns/internal/features/data/model/common/T;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_6

    goto :goto_5

    .line 154
    :cond_6
    :goto_1
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/model/common/T;->e:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 155
    sget-object p3, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->Back:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    if-ne p2, p3, :cond_8

    .line 156
    iput-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/z1;->a:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    iput-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/z1;->b:Lcom/sumsub/sns/internal/features/data/model/common/T;

    iput v5, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/z1;->e:I

    invoke-virtual {p0, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->a(Lcom/sumsub/sns/internal/features/presentation/utils/M;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_5

    .line 157
    :cond_7
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 158
    :cond_8
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->h()Lcom/sumsub/sns/internal/features/presentation/utils/SecondSideStep;

    move-result-object p2

    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t1;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v2, p2

    if-eq p2, v6, :cond_c

    if-eq p2, v5, :cond_b

    if-ne p2, v4, :cond_a

    .line 159
    iput-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/z1;->a:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    iput-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/z1;->b:Lcom/sumsub/sns/internal/features/data/model/common/T;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/z1;->e:I

    invoke-virtual {p0, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->a(Lcom/sumsub/sns/internal/features/presentation/utils/M;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    goto :goto_5

    .line 160
    :cond_9
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 161
    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 162
    :cond_b
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->k()V

    .line 163
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 164
    :cond_c
    iput-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/z1;->a:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    iput-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/z1;->b:Lcom/sumsub/sns/internal/features/data/model/common/T;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/z1;->e:I

    .line 165
    invoke-virtual {p1, p3}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;)V

    .line 166
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/utils/M;->l:Lcom/sumsub/sns/internal/features/presentation/utils/m;

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/utils/m;->a()Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    move-result-object p1

    .line 167
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->a(Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;)V

    .line 168
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->f(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_d

    goto :goto_4

    :cond_d
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_4
    if-ne p1, v1, :cond_e

    :goto_5
    return-object v1

    .line 169
    :cond_e
    :goto_6
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/utils/M;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/v2;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/v2;

    iget v3, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/v2;->d:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/v2;->d:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/v2;

    invoke-direct {v2, v0, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/v2;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v1, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/v2;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 170
    iget v4, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/v2;->d:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v4, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/v2;->a:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v16, v4

    move-object v4, v1

    move-object/from16 v1, v16

    goto/16 :goto_3

    :cond_3
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 171
    invoke-virtual/range {p1 .. p1}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    move-result-object v1

    .line 172
    new-instance v4, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v1, v8}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v4, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 173
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 174
    check-cast v8, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 175
    iget-object v8, v8, Lcom/sumsub/sns/internal/features/data/model/common/T;->e:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 176
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 177
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "camera upload, sides="

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 178
    sget-object v4, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 179
    iget-object v4, v4, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 180
    const-string v8, "DocCapture"

    invoke-virtual {v4, v8, v1, v7}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 181
    iput-boolean v6, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->Q:Z

    .line 182
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->H:Lkotlinx/coroutines/flow/n;

    invoke-interface {v1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object v8, v4

    check-cast v8, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    .line 183
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z0;

    const/4 v9, 0x7

    invoke-direct {v4, v7, v9}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z0;-><init>(Ljava/lang/String;I)V

    iget-boolean v9, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->C:Z

    if-eqz v9, :cond_5

    move-object v11, v4

    goto :goto_2

    :cond_5
    move-object v11, v7

    :goto_2
    const/4 v14, 0x0

    const/16 v15, 0x33

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    .line 184
    invoke-static/range {v8 .. v15}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/q1;Ljava/lang/Boolean;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z0;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e1;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p1;Lcom/sumsub/sns/core/presentation/base/m;I)Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    move-result-object v4

    invoke-interface {v1, v4}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    .line 185
    iput-object v1, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/v2;->a:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    iput v6, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/v2;->d:I

    const-string/jumbo v4, "sns_general_state_uploading"

    invoke-virtual {v0, v4, v2}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_6

    goto :goto_4

    :cond_6
    :goto_3
    check-cast v4, Ljava/lang/String;

    if-nez v4, :cond_7

    const-string v4, " "

    .line 186
    :cond_7
    new-instance v8, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/w2;

    invoke-direct {v8, v4, v7}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/w2;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x0

    invoke-static {v0, v4, v8, v6, v7}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 187
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/x2;

    invoke-direct {v4, v0, v1, v7}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/x2;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lcom/sumsub/sns/internal/features/presentation/utils/M;Lkotlin/coroutines/Continuation;)V

    new-instance v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/y2;

    invoke-direct {v6, v0, v7}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/y2;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lkotlin/coroutines/Continuation;)V

    .line 188
    new-instance v8, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/A2;

    invoke-direct {v8, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/A2;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;)V

    .line 189
    iput-object v7, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/v2;->a:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    iput v5, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/v2;->d:I

    invoke-virtual {v1, v4, v6, v8, v2}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lcom/sumsub/sns/internal/features/domain/n0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_8

    :goto_4
    return-object v3

    .line 190
    :cond_8
    :goto_5
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

.method public final a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/v1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/v1;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/v1;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/v1;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/v1;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/v1;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/v1;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 71
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/v1;->c:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 72
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->d:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/v1;->c:I

    .line 73
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    invoke-virtual {p1, v3, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    .line 74
    :cond_3
    :goto_1
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/p;

    if-nez p1, :cond_4

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 75
    :cond_4
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->k()Lcom/sumsub/sns/internal/features/data/model/common/n;

    move-result-object p1

    .line 76
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/n;->a:Ljava/util/List;

    .line 77
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/sumsub/sns/internal/features/data/model/common/m;

    .line 78
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/model/common/m;->a:Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 79
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->a:Lcom/sumsub/sns/internal/features/data/model/common/X;

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_2

    :cond_6
    move-object v0, v1

    .line 80
    :goto_2
    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/m;

    if-eqz v0, :cond_7

    .line 81
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/m;->a()Z

    move-result p1

    if-ne p1, v4, :cond_7

    .line 82
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/data/model/common/m;->d:Ljava/lang/String;

    .line 83
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;->DocCapture:Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    move p1, v4

    goto :goto_3

    :cond_7
    move p1, v3

    .line 84
    :goto_3
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->t:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 85
    iget-boolean v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->L:Z

    .line 86
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->g()Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    move-result-object v5

    sget-object v6, Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;->SEAMLESS_DOC_CAPTURE_LEGACY:Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    if-ne v5, v6, :cond_8

    .line 87
    sget-object v5, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;->MANUAL:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;

    goto :goto_5

    .line 88
    :cond_8
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->j:Landroidx/lifecycle/SavedStateHandle;

    const-string v6, "EXTRA_PREFER_AUTO_CAPTURE"

    invoke-virtual {v5, v6}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_a

    .line 89
    sget-object v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;->Companion:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    invoke-static {}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;->values()[Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;

    move-result-object v6

    array-length v7, v6

    move v8, v3

    :goto_4
    if-ge v8, v7, :cond_a

    aget-object v9, v6, v8

    .line 91
    invoke-virtual {v9}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;->getValue()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_9

    move-object v5, v9

    goto :goto_5

    :cond_9
    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    :cond_a
    move-object v5, v1

    :goto_5
    if-eqz v5, :cond_b

    .line 92
    invoke-virtual {v5}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;->getValue()Ljava/lang/String;

    move-result-object v5

    goto :goto_6

    :cond_b
    move-object v5, v1

    .line 93
    :goto_6
    iget-boolean v6, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->J:Z

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "checkAutoCaptureAllowedForStep: auto capture ff.enabled="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", level.autoEnabled="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", seamlessDocapture.enabled="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", preferredMode="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isRetake="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 94
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 95
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 96
    const-string v5, "DocCapture"

    invoke-virtual {v2, v5, v0, v1}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 97
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->t:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_c

    if-eqz p1, :cond_c

    move v3, v4

    .line 98
    :cond_c
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final a(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d2;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d2;

    iget v3, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d2;->h:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d2;->h:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d2;

    invoke-direct {v2, v0, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d2;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v1, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d2;->f:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 412
    iget v4, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d2;->h:I

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v4, :cond_2

    if-ne v4, v6, :cond_1

    iget-object v3, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d2;->e:Ljava/lang/String;

    iget-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d2;->d:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z0;

    iget-object v6, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d2;->c:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    iget-object v8, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d2;->b:Lkotlinx/coroutines/flow/n;

    iget-object v2, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d2;->a:Lkotlin/jvm/functions/Function0;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v11, v4

    move-object v4, v8

    move-object v8, v6

    goto :goto_2

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 413
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 414
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 415
    const-string v4, "DocCapture"

    const-string/jumbo v8, "showDocumentFlipHint"

    invoke-virtual {v1, v4, v8, v7}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 416
    iput-boolean v6, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->Q:Z

    .line 417
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e2;

    invoke-direct {v1, v7}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e2;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, v5, v1, v6, v7}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 418
    iget-object v8, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->H:Lkotlinx/coroutines/flow/n;

    invoke-interface {v8}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    .line 419
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z0;

    const/4 v9, 0x7

    invoke-direct {v4, v7, v9}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z0;-><init>(Ljava/lang/String;I)V

    iget-boolean v9, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->C:Z

    if-eqz v9, :cond_3

    goto :goto_1

    :cond_3
    move-object v4, v7

    .line 420
    :goto_1
    sget-object v9, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->FLIP:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    invoke-virtual {v9}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    move-result-object v9

    move-object/from16 v10, p1

    .line 421
    iput-object v10, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d2;->a:Lkotlin/jvm/functions/Function0;

    iput-object v8, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d2;->b:Lkotlinx/coroutines/flow/n;

    iput-object v1, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d2;->c:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    iput-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d2;->d:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z0;

    iput-object v9, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d2;->e:Ljava/lang/String;

    iput v6, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d2;->h:I

    const-string/jumbo v6, "sns_instructions_hint_turnOver"

    invoke-virtual {v0, v6, v2}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_4

    return-object v3

    :cond_4
    move-object v11, v4

    move-object v4, v8

    move-object v3, v9

    move-object v8, v1

    move-object v1, v2

    move-object v2, v10

    :goto_2
    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_5

    const-string v1, " "

    .line 422
    :cond_5
    new-instance v12, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e1;

    invoke-direct {v12, v3, v1, v5}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e1;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    const/4 v14, 0x0

    const/16 v15, 0x33

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    .line 423
    invoke-static/range {v8 .. v15}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/q1;Ljava/lang/Boolean;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z0;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e1;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p1;Lcom/sumsub/sns/core/presentation/base/m;I)Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    move-result-object v1

    invoke-interface {v4, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 424
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v8

    new-instance v11, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/f2;

    invoke-direct {v11, v2, v0, v7}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/f2;-><init>(Lkotlin/jvm/functions/Function0;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lkotlin/coroutines/Continuation;)V

    const/4 v12, 0x3

    invoke-static/range {v8 .. v13}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 425
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

.method public final a(Landroid/content/Context;)V
    .locals 9

    .line 1
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 2
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 3
    const-string v1, "DocCapture"

    const-string v2, "initiateVideoRecord"

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    move-result-object v0

    .line 5
    sget-boolean v1, Lcom/sumsub/sns/internal/core/common/k0;->f:Z

    if-eqz v1, :cond_0

    move-object v3, v0

    :cond_0
    if-nez v3, :cond_1

    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v3

    .line 7
    :cond_1
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "docapture_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ".mp4"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 8
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v3, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->z:Ljava/io/File;

    .line 9
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->H:Lkotlinx/coroutines/flow/n;

    invoke-interface {p1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    .line 10
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/q1;

    .line 11
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->z:Ljava/io/File;

    const/4 v3, 0x1

    .line 12
    invoke-direct {v2, v0, v3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/q1;-><init>(Ljava/io/File;Z)V

    const/4 v7, 0x0

    const/16 v8, 0x3e

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 13
    invoke-static/range {v1 .. v8}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/q1;Ljava/lang/Boolean;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z0;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e1;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p1;Lcom/sumsub/sns/core/presentation/base/m;I)Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/core/presentation/camera/f;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 113
    iget-object v2, v1, Lcom/sumsub/sns/internal/core/presentation/camera/f;->a:Ljava/io/File;

    .line 114
    iget-boolean v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->A:Z

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "video recording stopped. isWaitingForVideo="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, ", "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 115
    sget-object v4, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 116
    iget-object v5, v4, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 117
    const-string v6, "DocCapture"

    const/4 v10, 0x0

    invoke-virtual {v5, v6, v3, v10}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v11, 0x0

    .line 118
    iput-boolean v11, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->B:Z

    .line 119
    iput-boolean v11, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->p:Z

    .line 120
    iput-object v10, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->z:Ljava/io/File;

    .line 121
    iget-object v1, v1, Lcom/sumsub/sns/internal/core/presentation/camera/f;->b:Lcom/sumsub/sns/internal/core/presentation/camera/e;

    .line 122
    instance-of v3, v1, Lcom/sumsub/sns/internal/core/presentation/camera/c;

    if-eqz v3, :cond_0

    .line 123
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v7, "onVideoRecordingFinalized: "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 124
    move-object v7, v1

    check-cast v7, Lcom/sumsub/sns/internal/core/presentation/camera/c;

    .line 125
    iget-object v7, v7, Lcom/sumsub/sns/internal/core/presentation/camera/c;->b:Ljava/lang/Throwable;

    .line 126
    iget-object v8, v4, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 127
    invoke-virtual {v8, v6, v5, v7}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 128
    :cond_0
    iget-boolean v5, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->A:Z

    if-nez v5, :cond_1

    .line 129
    iget-object v4, v4, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 130
    const-string/jumbo v5, "onVideoRecorded: removing video file"

    invoke-virtual {v4, v6, v5, v10}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 131
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    if-eqz v3, :cond_3

    .line 132
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v11

    new-instance v14, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/X1;

    invoke-direct {v14, v0, v1, v10}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/X1;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lcom/sumsub/sns/internal/core/presentation/camera/e;Lkotlin/coroutines/Continuation;)V

    const/4 v15, 0x3

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v11 .. v16}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void

    .line 133
    :cond_1
    iput-boolean v11, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->A:Z

    .line 134
    instance-of v3, v1, Lcom/sumsub/sns/internal/core/presentation/camera/d;

    if-eqz v3, :cond_2

    check-cast v1, Lcom/sumsub/sns/internal/core/presentation/camera/d;

    goto :goto_0

    :cond_2
    move-object v1, v10

    :goto_0
    if-nez v1, :cond_4

    :cond_3
    return-void

    .line 135
    :cond_4
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->h()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v12

    .line 136
    new-instance v3, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 137
    new-instance v8, Lcom/sumsub/sns/internal/features/data/model/common/S;

    .line 138
    iget v4, v1, Lcom/sumsub/sns/internal/core/presentation/camera/d;->a:I

    .line 139
    iget-wide v5, v1, Lcom/sumsub/sns/internal/core/presentation/camera/d;->b:J

    .line 140
    invoke-direct {v8, v4, v5, v6}, Lcom/sumsub/sns/internal/features/data/model/common/S;-><init>(IJ)V

    const/4 v7, 0x0

    const/16 v9, 0x364

    const/4 v4, 0x0

    .line 141
    const-string v5, "IDENTITY_VIDEO"

    const/4 v6, 0x0

    move-object v1, v3

    move-object v3, v2

    invoke-direct/range {v1 .. v9}, Lcom/sumsub/sns/internal/features/data/model/common/T;-><init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;Ljava/lang/Boolean;Lcom/sumsub/sns/internal/features/data/model/common/S;I)V

    .line 142
    invoke-interface {v12, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 143
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->q:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->U:[Lkotlin/reflect/KProperty;

    aget-object v2, v2, v11

    .line 144
    iget-object v2, v1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    iget-object v1, v1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v2, v1, v12}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 145
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v3

    new-instance v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Y1;

    invoke-direct {v6, v0, v10}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Y1;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lkotlin/coroutines/Continuation;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;)V
    .locals 3

    .line 28
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->o:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    if-eq v0, p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 29
    :goto_0
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->o:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 30
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->j:Landroidx/lifecycle/SavedStateHandle;

    const-string v2, "current_side"

    invoke-virtual {v1, v2, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    if-eqz v0, :cond_1

    .line 31
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->l:Lcom/sumsub/sns/internal/features/presentation/camera/m;

    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/m;->a(Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;)V

    if-eqz p1, :cond_1

    .line 32
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->k:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;)V

    :cond_1
    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$PhotoCheckResult;)V
    .locals 4

    .line 310
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->O:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$PhotoCheckResult;

    if-eq p1, v0, :cond_0

    .line 311
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "requestFrameCheckResultUpdate: -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 312
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 313
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 314
    const-string v2, "DocCapture"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 315
    :cond_0
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->O:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$PhotoCheckResult;

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/i1;)V
    .locals 11

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 426
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "stopVideoRecording with error: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 427
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 428
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 429
    const-string v3, "DocCapture"

    invoke-virtual {v2, v3, v1, v0}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 430
    :cond_0
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->H:Lkotlinx/coroutines/flow/n;

    invoke-interface {v1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    .line 431
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/q1;

    const/4 v2, 0x0

    invoke-direct {v4, v0, v2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/q1;-><init>(Ljava/io/File;Z)V

    if-eqz p1, :cond_1

    .line 432
    new-instance v2, Lcom/sumsub/sns/core/presentation/base/m;

    .line 433
    new-instance v5, Lcom/sumsub/sns/internal/features/data/model/common/g0;

    .line 434
    new-instance v6, Lcom/sumsub/sns/internal/features/data/model/common/c0;

    .line 435
    iget-object v7, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/i1;->a:Ljava/lang/String;

    const/16 v8, 0x1e

    .line 436
    invoke-direct {v6, v8, v7, v0, v0}, Lcom/sumsub/sns/internal/features/data/model/common/c0;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v7, 0x1

    .line 437
    invoke-direct {v5, v0, p1, v6, v7}, Lcom/sumsub/sns/internal/features/data/model/common/g0;-><init>(Ljava/lang/Throwable;Landroid/os/Parcelable;Lcom/sumsub/sns/internal/features/data/model/common/c0;I)V

    .line 438
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->a:Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 439
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 440
    invoke-direct {v2, v5, p1, v0, v0}, Lcom/sumsub/sns/core/presentation/base/m;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/l0;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;)V

    move-object v9, v2

    goto :goto_0

    :cond_1
    move-object v9, v0

    :goto_0
    const/16 v10, 0x16

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 441
    invoke-static/range {v3 .. v10}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/q1;Ljava/lang/Boolean;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z0;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e1;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p1;Lcom/sumsub/sns/core/presentation/base/m;I)Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    move-result-object p1

    invoke-interface {v1, p1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/j1;)V
    .locals 3

    .line 66
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleVideoRecordError: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 67
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 68
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 69
    const-string v1, "DocCapture"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 70
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/l1;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/l1;

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    return-void
.end method

.method public final a(Ljava/io/File;)V
    .locals 18

    move-object/from16 v0, p0

    .line 99
    iget-boolean v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->D:Z

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "onPictureTaken: waiting="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 100
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 101
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 102
    const-string v3, "DocCapture"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v1, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 103
    iget-boolean v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->D:Z

    if-eqz v1, :cond_0

    .line 104
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v5

    new-instance v8, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/O1;

    move-object/from16 v10, p1

    invoke-direct {v8, v0, v10, v4}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/O1;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Ljava/io/File;Lkotlin/coroutines/Continuation;)V

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void

    :cond_0
    move-object/from16 v10, p1

    .line 105
    sget-object v11, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {v0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    const/4 v15, 0x4

    const/16 v16, 0x0

    const-string v13, "Picture is taken"

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->i$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 106
    new-instance v2, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 107
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->j:Landroidx/lifecycle/SavedStateHandle;

    const-string v3, "current_side"

    invoke-virtual {v1, v3}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    const/16 v17, 0x3ec

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    move-object/from16 v11, p1

    move-object v9, v2

    .line 108
    invoke-direct/range {v9 .. v17}, Lcom/sumsub/sns/internal/features/data/model/common/T;-><init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;Ljava/lang/Boolean;Lcom/sumsub/sns/internal/features/data/model/common/S;I)V

    .line 109
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->k:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    if-eqz v1, :cond_1

    .line 110
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v5

    new-instance v8, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/A1;

    invoke-direct {v8, v0, v1, v2, v4}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/A1;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lcom/sumsub/sns/internal/features/presentation/utils/M;Lcom/sumsub/sns/internal/features/data/model/common/T;Lkotlin/coroutines/Continuation;)V

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void

    :cond_1
    const/4 v1, 0x1

    .line 111
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/core/presentation/base/C;->showProgress(Z)V

    const/16 v5, 0xd

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 112
    invoke-static/range {v0 .. v6}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    return-void
.end method

.method public final a(Landroid/content/Context;Landroid/graphics/Bitmap;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g1;)Z
    .locals 4

    .line 355
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->S:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 356
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a1;->b:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g1;

    .line 357
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g1;->a:Ljava/lang/Float;

    if-eqz v0, :cond_0

    .line 358
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    .line 359
    :goto_0
    iget-object v2, p3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g1;->a:Ljava/lang/Float;

    if-eqz v2, :cond_1

    .line 360
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v1

    :cond_1
    cmpl-float v0, v1, v0

    if-lez v0, :cond_4

    .line 361
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "better frame detected: score -> "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 362
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 363
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 364
    const-string v2, "DocCapture"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 365
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->S:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a1;

    if-eqz v0, :cond_2

    .line 366
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a1;->a:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_2

    .line 367
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 368
    :cond_2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a1;

    invoke-direct {v0, p2, p3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a1;-><init>(Landroid/graphics/Bitmap;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g1;)V

    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->S:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a1;

    .line 369
    iget-boolean p2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->L:Z

    const/4 p3, 0x1

    if-eqz p2, :cond_3

    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->z:Ljava/io/File;

    if-nez p2, :cond_3

    .line 370
    iput-boolean p3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->p:Z

    .line 371
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->a(Landroid/content/Context;)V

    :cond_3
    return p3

    :cond_4
    const/4 p1, 0x0

    return p1
.end method

.method public final b(Landroid/content/Context;Landroid/graphics/Bitmap;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T1;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T1;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T1;->e:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T1;

    invoke-direct {v0, p0, p3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T1;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    goto :goto_0

    :goto_1
    iget-object p3, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T1;->c:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 11
    iget v1, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T1;->e:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v7, 0x0

    if-eqz v1, :cond_4

    if-eq v1, v4, :cond_3

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T1;->b:Landroid/graphics/Bitmap;

    iget-object p2, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T1;->a:Landroid/content/Context;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    iget-object p2, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T1;->b:Landroid/graphics/Bitmap;

    iget-object p1, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T1;->a:Landroid/content/Context;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 12
    iget-boolean p3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->D:Z

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v8, "onRequestedPictureTaken: waiting="

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    .line 13
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 14
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 15
    const-string v8, "DocCapture"

    invoke-virtual {v1, v8, p3, v5}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 16
    iput-boolean v7, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->I:Z

    .line 17
    iget-boolean p3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->D:Z

    if-eqz p3, :cond_5

    .line 18
    iget-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->R:Lkotlinx/coroutines/channels/d;

    iput-object p1, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T1;->a:Landroid/content/Context;

    iput-object p2, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T1;->b:Landroid/graphics/Bitmap;

    iput v4, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T1;->e:I

    invoke-interface {p3, v6}, Lkotlinx/coroutines/channels/o;->D(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v0, :cond_5

    goto :goto_5

    .line 19
    :cond_5
    :goto_2
    iget-boolean p3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->L:Z

    if-nez p3, :cond_6

    iget-boolean p3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->G:Z

    if-eqz p3, :cond_9

    .line 20
    :cond_6
    iput-object p1, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T1;->a:Landroid/content/Context;

    iput-object p2, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T1;->b:Landroid/graphics/Bitmap;

    iput v3, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T1;->e:I

    invoke-virtual {p0, p2, v4, v6}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->a(Landroid/graphics/Bitmap;ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v0, :cond_7

    goto :goto_5

    :cond_7
    move-object v9, p2

    move-object p2, p1

    move-object p1, v9

    :goto_3
    check-cast p3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g1;

    if-eqz p3, :cond_8

    .line 21
    iget-object v1, p3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g1;->a:Ljava/lang/Float;

    iget v3, p3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g1;->c:F

    iget p3, p3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g1;->d:F

    .line 22
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g1;

    invoke-direct {v4, v1, v7, v3, p3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g1;-><init>(Ljava/lang/Float;ZFF)V

    move-object v3, p1

    goto :goto_4

    :cond_8
    move-object v9, p2

    move-object p2, p1

    move-object p1, v9

    :cond_9
    move-object v3, p2

    move-object v4, v5

    move-object p2, p1

    .line 23
    :goto_4
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1, v7, v7, v7, v7}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 24
    iput-object v5, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T1;->a:Landroid/content/Context;

    iput-object v5, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T1;->b:Landroid/graphics/Bitmap;

    iput v2, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T1;->e:I

    move-object v1, p0

    move-object v2, p2

    move-object v5, v4

    move-object v4, p1

    invoke-virtual/range {v1 .. v6}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->a(Landroid/content/Context;Landroid/graphics/Bitmap;Landroid/graphics/Rect;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g1;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    :goto_5
    return-object v0

    .line 25
    :cond_a
    :goto_6
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final b(Landroid/content/Context;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M1;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M1;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M1;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M1;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M1;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M1;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 26
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M1;->d:I

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v2, :cond_5

    if-eq v2, v7, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlinx/coroutines/channels/ChannelResult;

    invoke-virtual {p2}, Lkotlinx/coroutines/channels/ChannelResult;->l()Ljava/lang/Object;

    move-result-object p1

    goto :goto_2

    :cond_4
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M1;->a:Landroid/content/Context;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 27
    iput-boolean v7, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->Q:Z

    .line 28
    iget-boolean p2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->B:Z

    if-nez p2, :cond_a

    .line 29
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M1;->a:Landroid/content/Context;

    iput v7, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M1;->d:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->g(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6

    goto :goto_4

    .line 30
    :cond_6
    :goto_1
    iget-boolean p2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->L:Z

    if-eqz p2, :cond_7

    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->z:Ljava/io/File;

    if-nez p2, :cond_7

    .line 31
    iput-boolean v7, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->p:Z

    .line 32
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->a(Landroid/content/Context;)V

    .line 33
    :cond_7
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->P:Lkotlinx/coroutines/channels/d;

    iput-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M1;->a:Landroid/content/Context;

    iput v6, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M1;->d:I

    invoke-interface {p1, v0}, Lkotlinx/coroutines/channels/o;->p(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    goto :goto_4

    .line 34
    :cond_8
    :goto_2
    invoke-static {p1}, Lkotlinx/coroutines/channels/ChannelResult;->i(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    .line 35
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 36
    :cond_9
    iput v5, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M1;->d:I

    const-wide/16 p1, 0x7d0

    invoke-static {p1, p2, v0}, Lkotlinx/coroutines/DelayKt;->b(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    goto :goto_4

    .line 37
    :cond_a
    :goto_3
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->f()Z

    move-result p1

    if-eqz p1, :cond_b

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M1;->d:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->d(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    :goto_4
    return-object v1

    .line 38
    :cond_b
    :goto_5
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v4

    new-instance v7, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/N1;

    invoke-direct {v7, p0, v3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/N1;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lkotlin/coroutines/Continuation;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 39
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 14

    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B1;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B1;->f:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B1;->f:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B1;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B1;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B1;->d:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 40
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B1;->f:I

    const-string v3, " "

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v6, :cond_2

    if-ne v2, v5, :cond_1

    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B1;->c:Ljava/lang/Object;

    check-cast v1, Lkotlinx/coroutines/flow/n;

    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B1;->b:Ljava/lang/Object;

    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e1;

    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B1;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v5, v0

    move-object v9, v2

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B1;->c:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B1;->b:Ljava/lang/Object;

    check-cast v6, Lkotlinx/coroutines/flow/n;

    iget-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B1;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v13, v7

    move-object v7, v2

    move-object v2, v13

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 41
    iget-boolean p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->B:Z

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "finishWithCurrentResults: isCapturingVideo="

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 42
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 43
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 44
    const-string v7, "DocCapture"

    invoke-virtual {v2, v7, p1, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 45
    iget-boolean p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->B:Z

    if-eqz p1, :cond_7

    .line 46
    iput-boolean v6, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->A:Z

    .line 47
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->H:Lkotlinx/coroutines/flow/n;

    invoke-interface {p1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    .line 48
    sget-object v7, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->SUCCESS_CHECK:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    invoke-virtual {v7}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    move-result-object v7

    .line 49
    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B1;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B1;->b:Ljava/lang/Object;

    iput-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B1;->c:Ljava/lang/Object;

    iput v6, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B1;->f:I

    const-string/jumbo v6, "sns_instructions_hint_allSet"

    invoke-virtual {p0, v6, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object v13, v6

    move-object v6, p1

    move-object p1, v13

    :goto_1
    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_5

    move-object p1, v3

    .line 50
    :cond_5
    new-instance v8, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e1;

    const/4 v9, 0x0

    invoke-direct {v8, v7, p1, v9}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e1;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 51
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;

    .line 52
    sget-object v7, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/CheckDetectionResult$SizeCheckResult;->SMALL:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/CheckDetectionResult$SizeCheckResult;

    .line 53
    invoke-direct {p1, v9, v7, v9}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;-><init>(ZLcom/sumsub/sns/internal/features/presentation/camera/photo/document/CheckDetectionResult$SizeCheckResult;Z)V

    .line 54
    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B1;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    iput-object v8, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B1;->b:Ljava/lang/Object;

    iput-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B1;->c:Ljava/lang/Object;

    iput v5, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B1;->f:I

    .line 55
    invoke-virtual {p0, p1, v9, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    move-object v5, v2

    move-object v1, v6

    move-object v9, v8

    .line 56
    :goto_3
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z0;

    .line 57
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State;->DEFAULT:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State;

    .line 58
    iget-boolean p1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z0;->b:Z

    .line 59
    new-instance v8, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z0;

    invoke-direct {v8, v3, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z0;-><init>(Ljava/lang/String;ZLcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State;)V

    const/4 v11, 0x0

    const/16 v12, 0x33

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    .line 60
    invoke-static/range {v5 .. v12}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/q1;Ljava/lang/Boolean;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z0;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e1;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p1;Lcom/sumsub/sns/core/presentation/base/m;I)Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    move-result-object p1

    invoke-interface {v1, p1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 61
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v5

    new-instance v8, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C1;

    invoke-direct {v8, p0, v4}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C1;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lkotlin/coroutines/Continuation;)V

    const/4 v9, 0x3

    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 62
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 63
    :cond_7
    new-instance v2, Lcom/sumsub/sns/internal/features/data/model/common/J;

    .line 64
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->h()Ljava/util/List;

    move-result-object p1

    .line 65
    invoke-direct {v2, p1, v6}, Lcom/sumsub/sns/internal/features/data/model/common/J;-><init>(Ljava/util/List;Z)V

    const/16 v5, 0xd

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    .line 66
    invoke-static/range {v0 .. v6}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    .line 67
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final b(Ljava/io/File;)V
    .locals 9

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "onVideoRecordingStarted: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 5
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 6
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 7
    const-string v1, "DocCapture"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    .line 8
    iput-boolean p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->p:Z

    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->B:Z

    .line 10
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v3

    new-instance v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z1;

    invoke-direct {v6, p0, v2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z1;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lkotlin/coroutines/Continuation;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public final c(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/b2;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/b2;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/b2;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/b2;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/b2;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/b2;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/b2;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 8
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/b2;->c:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 9
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->f()Z

    move-result p1

    if-eqz p1, :cond_4

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/b2;->c:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->d(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    .line 10
    :cond_4
    :goto_1
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/h3;

    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/h3;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;)V

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/b2;->c:I

    invoke-virtual {p0, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->a(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    .line 11
    :cond_5
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final d(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g2;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g2;

    iget v3, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g2;->e:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g2;->e:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g2;

    invoke-direct {v2, v0, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g2;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v1, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g2;->c:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 1
    iget v4, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g2;->e:I

    const/16 v5, 0x3e8

    const/4 v6, 0x0

    const-string v7, "DocCapture"

    const/4 v8, 0x3

    const/4 v9, 0x2

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eqz v4, :cond_4

    if-eq v4, v10, :cond_3

    if-eq v4, v9, :cond_2

    if-ne v4, v8, :cond_1

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_3
    iget-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g2;->b:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    iget-object v10, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g2;->a:Lkotlinx/coroutines/flow/n;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    :goto_1
    move-object v12, v4

    goto :goto_2

    :cond_4
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 2
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 3
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 4
    const-string/jumbo v4, "showDocumentTiltHint"

    invoke-virtual {v1, v7, v4, v11}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 5
    iput-boolean v10, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->Q:Z

    .line 6
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/h2;

    invoke-direct {v1, v11}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/h2;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, v6, v1, v10, v11}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 7
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->H:Lkotlinx/coroutines/flow/n;

    invoke-interface {v1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    .line 8
    iput-object v1, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g2;->a:Lkotlinx/coroutines/flow/n;

    iput-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g2;->b:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    iput v10, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g2;->e:I

    const-string/jumbo v10, "sns_instructions_hint_tiltDocument"

    invoke-virtual {v0, v10, v2}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v3, :cond_5

    goto/16 :goto_5

    :cond_5
    move-object v12, v10

    move-object v10, v1

    move-object v1, v12

    goto :goto_1

    :goto_2
    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_6

    const-string v1, " "

    :cond_6
    new-instance v15, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z0;

    const/4 v4, 0x6

    invoke-direct {v15, v1, v4}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z0;-><init>(Ljava/lang/String;I)V

    .line 9
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->b:Ljava/lang/String;

    if-eqz v1, :cond_7

    invoke-static {v1}, Lcom/sumsub/sns/internal/features/data/model/common/g2;->a(Ljava/lang/String;)Lcom/sumsub/sns/internal/features/data/model/common/q2;

    move-result-object v1

    goto :goto_3

    :cond_7
    move-object v1, v11

    .line 10
    :goto_3
    iget-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->j:Landroidx/lifecycle/SavedStateHandle;

    const-string v13, "current_side"

    invoke-virtual {v4, v13}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 11
    iget-object v13, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->w:Lkotlin/Lazy;

    invoke-interface {v13}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/I2;

    .line 12
    iget v13, v13, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/I2;->a:F

    .line 13
    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/Boxing;->boxFloat(F)Ljava/lang/Float;

    move-result-object v13

    .line 14
    new-instance v14, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p1;

    invoke-direct {v14, v1, v4, v13}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p1;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/q2;Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;Ljava/lang/Float;)V

    const/16 v18, 0x0

    const/16 v19, 0x23

    const/4 v13, 0x0

    move-object/from16 v17, v14

    const/4 v14, 0x0

    const/16 v16, 0x0

    .line 15
    invoke-static/range {v12 .. v19}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/q1;Ljava/lang/Boolean;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z0;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e1;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p1;Lcom/sumsub/sns/core/presentation/base/m;I)Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    move-result-object v1

    invoke-interface {v10, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 16
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 17
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 18
    const-string/jumbo v4, "waiting for tilt hint ... "

    invoke-virtual {v1, v7, v4, v11}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 19
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->w:Lkotlin/Lazy;

    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/I2;

    .line 20
    iget v4, v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/I2;->b:I

    int-to-float v4, v4

    .line 21
    iget v1, v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/I2;->a:F

    mul-float/2addr v4, v1

    int-to-float v1, v5

    mul-float/2addr v4, v1

    float-to-long v12, v4

    .line 22
    iput-object v11, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g2;->a:Lkotlinx/coroutines/flow/n;

    iput-object v11, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g2;->b:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    iput v9, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g2;->e:I

    invoke-static {v12, v13, v2}, Lkotlinx/coroutines/DelayKt;->b(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_8

    goto :goto_5

    .line 23
    :cond_8
    :goto_4
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->H:Lkotlinx/coroutines/flow/n;

    invoke-interface {v1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object v9, v4

    check-cast v9, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    const/4 v15, 0x0

    const/16 v16, 0x2f

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v9 .. v16}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/q1;Ljava/lang/Boolean;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z0;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e1;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p1;Lcom/sumsub/sns/core/presentation/base/m;I)Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    move-result-object v4

    invoke-interface {v1, v4}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 24
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->w:Lkotlin/Lazy;

    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/I2;

    .line 25
    iget v1, v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/I2;->c:F

    int-to-float v4, v5

    mul-float/2addr v1, v4

    float-to-long v4, v1

    .line 26
    iput v8, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g2;->e:I

    invoke-static {v4, v5, v2}, Lkotlinx/coroutines/DelayKt;->b(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_9

    :goto_5
    return-object v3

    .line 27
    :cond_9
    :goto_6
    iput-boolean v6, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->Q:Z

    .line 28
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

.method public final e(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/i2;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/i2;

    iget v3, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/i2;->c:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/i2;->c:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/i2;

    invoke-direct {v2, v0, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/i2;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v1, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/i2;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 15
    iget v4, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/i2;->c:I

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v4, :cond_2

    if-ne v4, v6, :cond_1

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 16
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->H:Lkotlinx/coroutines/flow/n;

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->i()Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    move-result-object v8

    const/4 v14, 0x0

    const/16 v15, 0x37

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v8 .. v15}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/q1;Ljava/lang/Boolean;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z0;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e1;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p1;Lcom/sumsub/sns/core/presentation/base/m;I)Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    move-result-object v4

    invoke-interface {v1, v4}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 17
    iget-boolean v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->G:Z

    if-eqz v1, :cond_6

    .line 18
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->g()Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    move-result-object v1

    sget-object v4, Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;->SEAMLESS_DOC_CAPTURE_LEGACY:Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    if-ne v1, v4, :cond_3

    .line 19
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;->MANUAL:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;

    goto :goto_2

    .line 20
    :cond_3
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->j:Landroidx/lifecycle/SavedStateHandle;

    const-string v4, "EXTRA_PREFER_AUTO_CAPTURE"

    invoke-virtual {v1, v4}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_5

    .line 21
    sget-object v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;->Companion:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    invoke-static {}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;->values()[Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;

    move-result-object v4

    array-length v8, v4

    move v9, v5

    :goto_1
    if-ge v9, v8, :cond_5

    aget-object v10, v4, v9

    .line 23
    invoke-virtual {v10}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;->getValue()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    move-object v1, v10

    goto :goto_2

    :cond_4
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_5
    move-object v1, v7

    .line 24
    :goto_2
    sget-object v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;->MANUAL:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;

    if-eq v1, v4, :cond_6

    .line 25
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v8

    new-instance v11, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/m2;

    invoke-direct {v11, v0, v7}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/m2;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lkotlin/coroutines/Continuation;)V

    const/4 v12, 0x3

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v8 .. v13}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    goto :goto_3

    .line 26
    :cond_6
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v14

    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/n2;

    invoke-direct {v1, v0, v7}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/n2;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lkotlin/coroutines/Continuation;)V

    const/16 v18, 0x3

    const/16 v19, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v17, v1

    invoke-static/range {v14 .. v19}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 27
    :goto_3
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->d:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    iput v6, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/i2;->c:I

    .line 28
    check-cast v1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    invoke-virtual {v1, v5, v2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_7

    return-object v3

    .line 29
    :cond_7
    :goto_4
    check-cast v1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/p;

    const-string v2, "DocCapture"

    if-nez v1, :cond_8

    .line 30
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 31
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 32
    const-string/jumbo v3, "showInitialViewState: error. Applicant null"

    invoke-virtual {v1, v2, v3, v7}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 33
    invoke-virtual {v0, v3}, Lcom/sumsub/sns/core/presentation/base/C;->finishAbnormal(Ljava/lang/String;)V

    .line 34
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 35
    :cond_8
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->a:Lcom/sumsub/sns/internal/features/data/model/common/X;

    invoke-virtual {v1, v3}, Lcom/sumsub/sns/internal/features/data/model/common/p;->b(Lcom/sumsub/sns/internal/features/data/model/common/X;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/q2;

    .line 36
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->j:Landroidx/lifecycle/SavedStateHandle;

    const-string v4, "current_side"

    invoke-virtual {v3, v4}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 37
    sget-object v4, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->Back:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    if-ne v3, v4, :cond_a

    .line 38
    iget-boolean v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->G:Z

    if-eqz v3, :cond_9

    iget-boolean v4, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->J:Z

    if-nez v4, :cond_9

    move v5, v6

    :cond_9
    iput-boolean v5, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->r:Z

    if-nez v3, :cond_a

    .line 39
    iget-boolean v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->J:Z

    if-nez v3, :cond_a

    .line 40
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v8

    new-instance v11, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/j2;

    invoke-direct {v11, v0, v7}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/j2;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lkotlin/coroutines/Continuation;)V

    const/4 v12, 0x3

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v8 .. v13}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 41
    :cond_a
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "SDK is using - "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 42
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 43
    iget-object v3, v3, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 44
    invoke-virtual {v3, v2, v1, v7}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 45
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

.method public final f(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 2
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 3
    const-string v1, "another side requested, showing turn-document hint"

    const/4 v2, 0x0

    const-string v3, "DocCapture"

    invoke-virtual {v0, v3, v1, v2}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 4
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/b3;

    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/b3;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;)V

    invoke-virtual {p0, v0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->a(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final f()Z
    .locals 3

    .line 5
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->L:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->C:Z

    if-eqz v0, :cond_0

    .line 6
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->v:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->U:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final g()Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->L:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->x:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->U:[Lkotlin/reflect/KProperty;

    const/4 v3, 0x4

    aget-object v2, v2, v3

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    sget-object v0, Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;->SEAMLESS_DOC_CAPTURE_LEGACY:Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    goto :goto_1

    .line 4
    :cond_0
    sget-object v0, Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;->SEAMLESS_DOC_CAPTURE:Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    goto :goto_1

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->F:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->U:[Lkotlin/reflect/KProperty;

    const/4 v3, 0x5

    aget-object v2, v2, v3

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 6
    sget-object v0, Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;->PHOTO_AND_ANALYZER:Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    .line 7
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->h:Lcom/sumsub/sns/internal/ml/autocapture/d;

    .line 8
    iget-boolean v2, v2, Lcom/sumsub/sns/internal/ml/autocapture/d;->l:Z

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_4

    .line 9
    sget-object v0, Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;->ANALYZER:Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    goto :goto_1

    .line 10
    :cond_3
    sget-object v0, Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;->PHOTO:Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    .line 11
    :cond_4
    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "cameraMode: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 12
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 13
    iget-object v3, v3, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 14
    const-string v4, "DocCapture"

    invoke-virtual {v3, v4, v2, v1}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public final g(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/l2;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/l2;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/l2;->g:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/l2;->g:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/l2;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/l2;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/l2;->e:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 15
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/l2;->g:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/l2;->d:Ljava/lang/String;

    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/l2;->c:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z0;

    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/l2;->b:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/l2;->a:Lkotlinx/coroutines/flow/n;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v5, v2

    move-object v2, v3

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 16
    sget-object p1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 17
    iget-object p1, p1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 18
    const-string v2, "DocCapture"

    const-string/jumbo v4, "showWaitPopup"

    const/4 v5, 0x0

    invoke-virtual {p1, v2, v4, v5}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 19
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->H:Lkotlinx/coroutines/flow/n;

    invoke-interface {p1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    .line 20
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z0;

    const/4 v6, 0x7

    invoke-direct {v4, v5, v6}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z0;-><init>(Ljava/lang/String;I)V

    iget-boolean v6, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->C:Z

    if-eqz v6, :cond_3

    goto :goto_1

    :cond_3
    move-object v4, v5

    .line 21
    :goto_1
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/l2;->a:Lkotlinx/coroutines/flow/n;

    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/l2;->b:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    iput-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/l2;->c:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z0;

    const-string v5, ""

    iput-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/l2;->d:Ljava/lang/String;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/l2;->g:I

    const-string/jumbo v3, "sns_general_progress_text"

    invoke-virtual {p0, v3, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_4

    return-object v1

    :cond_4
    move-object v1, v0

    move-object v0, p1

    move-object p1, v1

    move-object v1, v5

    move-object v5, v4

    :goto_2
    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_5

    const-string p1, " "

    .line 22
    :cond_5
    new-instance v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e1;

    invoke-direct {v6, v1, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v8, 0x0

    const/16 v9, 0x33

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    .line 23
    invoke-static/range {v2 .. v9}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/q1;Ljava/lang/Boolean;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z0;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e1;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p1;Lcom/sumsub/sns/core/presentation/base/m;I)Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 24
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final getDefaultState()Lcom/sumsub/sns/core/presentation/base/s;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/s1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/s1;-><init>()V

    .line 6
    return-object v0
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

.method public final h()Ljava/util/List;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->q:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->U:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Ljava/util/List;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
.end method

.method public final i()Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/q1;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->z:Ljava/io/File;

    .line 5
    .line 6
    iget-boolean v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->B:Z

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/q1;-><init>(Ljava/io/File;Z)V

    .line 10
    .line 11
    iget-boolean v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->L:Z

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    .line 17
    :goto_0
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    .line 18
    .line 19
    const/16 v2, 0x18

    .line 20
    .line 21
    .line 22
    invoke-direct {v1, v0, v2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/q1;I)V

    .line 23
    return-object v1
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

.method public final j()V
    .locals 7

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 3
    .line 4
    iget-object v1, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 5
    .line 6
    const-string v2, "DocCapture"

    .line 7
    .line 8
    .line 9
    const-string/jumbo v3, "onTakePictureClicked"

    .line 10
    const/4 v4, 0x0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, v2, v3, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 14
    .line 15
    iget-boolean v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->Q:Z

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 20
    .line 21
    const-string v1, "ignoring take picture while side capture is delayed"

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v2, v1, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 25
    return-void

    .line 26
    .line 27
    :cond_0
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->S:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a1;

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 32
    .line 33
    const-string v1, "Skipping manually taken picture in favour of auto."

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v2, v1, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 37
    return-void

    .line 38
    .line 39
    :cond_1
    iget-boolean v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->D:Z

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 44
    .line 45
    const-string v1, "ignoring take picture while photo animation is pending"

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v2, v1, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 49
    return-void

    .line 50
    :cond_2
    const/4 v1, 0x1

    .line 51
    .line 52
    iput-boolean v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->D:Z

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->g()Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    .line 56
    move-result-object v3

    .line 57
    .line 58
    sget-object v5, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t1;->b:[I

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 62
    move-result v3

    .line 63
    .line 64
    aget v3, v5, v3

    .line 65
    .line 66
    const-string v5, "On take picture is clicked"

    .line 67
    .line 68
    if-eq v3, v1, :cond_4

    .line 69
    const/4 v6, 0x2

    .line 70
    .line 71
    if-eq v3, v6, :cond_3

    .line 72
    .line 73
    iput-boolean v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->I:Z

    .line 74
    goto :goto_0

    .line 75
    .line 76
    :cond_3
    iput-boolean v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->I:Z

    .line 77
    .line 78
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v2, v5, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 82
    .line 83
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/b1;

    .line 84
    .line 85
    .line 86
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/b1;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 90
    goto :goto_0

    .line 91
    .line 92
    :cond_4
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v2, v5, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 96
    .line 97
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/b1;

    .line 98
    .line 99
    .line 100
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/b1;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 104
    .line 105
    :goto_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/n1;

    .line 106
    .line 107
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/c3;

    .line 108
    .line 109
    .line 110
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/c3;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;)V

    .line 111
    .line 112
    .line 113
    invoke-direct {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/n1;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 117
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
.end method

.method public final k()V
    .locals 12

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 5
    .line 6
    const-string v1, "DocCapture"

    .line 7
    .line 8
    .line 9
    const-string/jumbo v2, "sideness unknown, prompting for a second side"

    .line 10
    const/4 v3, 0x0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1, v2, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 14
    .line 15
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->s:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 16
    .line 17
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->U:[Lkotlin/reflect/KProperty;

    .line 18
    const/4 v2, 0x1

    .line 19
    .line 20
    aget-object v1, v1, v2

    .line 21
    .line 22
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 23
    .line 24
    iget-object v4, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 25
    .line 26
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v4, v0, v1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 30
    .line 31
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a2;

    .line 32
    .line 33
    .line 34
    invoke-direct {v0, v3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a2;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 35
    const/4 v1, 0x0

    .line 36
    .line 37
    .line 38
    invoke-static {p0, v1, v0, v2, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 39
    .line 40
    iput-boolean v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->Q:Z

    .line 41
    .line 42
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->H:Lkotlinx/coroutines/flow/n;

    .line 43
    .line 44
    .line 45
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 46
    move-result-object v1

    .line 47
    move-object v4, v1

    .line 48
    .line 49
    check-cast v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    .line 50
    .line 51
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z0;

    .line 52
    const/4 v2, 0x7

    .line 53
    .line 54
    .line 55
    invoke-direct {v1, v3, v2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z0;-><init>(Ljava/lang/String;I)V

    .line 56
    .line 57
    iget-boolean v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->C:Z

    .line 58
    .line 59
    if-eqz v2, :cond_0

    .line 60
    move-object v7, v1

    .line 61
    goto :goto_0

    .line 62
    :cond_0
    move-object v7, v3

    .line 63
    :goto_0
    const/4 v10, 0x0

    .line 64
    .line 65
    const/16 v11, 0x3b

    .line 66
    const/4 v5, 0x0

    .line 67
    const/4 v6, 0x0

    .line 68
    const/4 v8, 0x0

    .line 69
    const/4 v9, 0x0

    .line 70
    .line 71
    .line 72
    invoke-static/range {v4 .. v11}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/q1;Ljava/lang/Boolean;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z0;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e1;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p1;Lcom/sumsub/sns/core/presentation/base/m;I)Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    .line 73
    move-result-object v1

    .line 74
    .line 75
    .line 76
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 77
    .line 78
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/utils/P;->a:Lcom/sumsub/sns/internal/features/presentation/utils/P;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 82
    return-void
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

.method public final onCleared()V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/sumsub/sns/core/presentation/base/M0;->onCleared()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/F1;

    .line 10
    const/4 v1, 0x0

    .line 11
    .line 12
    .line 13
    invoke-direct {v3, p0, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/F1;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lkotlin/coroutines/Continuation;)V

    .line 14
    const/4 v4, 0x3

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    .line 18
    .line 19
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 20
    return-void
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

.method public final onHandleError(Lcom/sumsub/sns/internal/features/data/model/common/l0;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/l0;->d()Landroid/os/Parcelable;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    instance-of v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/j1;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/j1;

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    .line 14
    :goto_0
    if-eqz v0, :cond_1

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/j1;)V

    .line 18
    return-void

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/C;->onHandleError(Lcom/sumsub/sns/internal/features/data/model/common/l0;)V

    .line 22
    return-void
    .line 23
    .line 24
    .line 25
.end method

.method public final onPrepare(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 14

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/R1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/R1;

    .line 8
    .line 9
    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/R1;->e:I

    .line 10
    .line 11
    const/high16 v2, -0x80000000

    .line 12
    .line 13
    and-int v3, v1, v2

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    sub-int/2addr v1, v2

    .line 17
    .line 18
    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/R1;->e:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/R1;

    .line 22
    .line 23
    check-cast p1, Lkotlin/coroutines/jvm/internal/ContinuationImpl;

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/R1;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    .line 27
    .line 28
    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/R1;->c:Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/R1;->e:I

    .line 35
    const/4 v3, 0x4

    .line 36
    const/4 v4, 0x3

    .line 37
    const/4 v5, 0x2

    .line 38
    const/4 v6, 0x1

    .line 39
    const/4 v7, 0x0

    .line 40
    .line 41
    if-eqz v2, :cond_5

    .line 42
    .line 43
    if-eq v2, v6, :cond_4

    .line 44
    .line 45
    if-eq v2, v5, :cond_3

    .line 46
    .line 47
    if-eq v2, v4, :cond_2

    .line 48
    .line 49
    if-ne v2, v3, :cond_1

    .line 50
    .line 51
    .line 52
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 53
    .line 54
    goto/16 :goto_5

    .line 55
    .line 56
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    .line 61
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    throw p1

    .line 63
    .line 64
    :cond_2
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/R1;->b:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;

    .line 65
    .line 66
    iget-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/R1;->a:Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    .line 67
    .line 68
    .line 69
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 70
    .line 71
    goto/16 :goto_3

    .line 72
    .line 73
    .line 74
    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 75
    .line 76
    goto/16 :goto_2

    .line 77
    .line 78
    .line 79
    :cond_4
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 80
    goto :goto_1

    .line 81
    .line 82
    .line 83
    :cond_5
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 84
    .line 85
    iput v6, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/R1;->e:I

    .line 86
    .line 87
    .line 88
    invoke-static {p0, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->onPrepare$suspendImpl(Lcom/sumsub/sns/core/presentation/base/M0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 89
    move-result-object p1

    .line 90
    .line 91
    if-ne p1, v1, :cond_6

    .line 92
    .line 93
    goto/16 :goto_4

    .line 94
    .line 95
    :cond_6
    :goto_1
    sget-object v8, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 96
    .line 97
    .line 98
    invoke-static {p0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 99
    move-result-object v9

    .line 100
    .line 101
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->j:Landroidx/lifecycle/SavedStateHandle;

    .line 102
    .line 103
    const-string v2, "current_side"

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v2}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 107
    move-result-object p1

    .line 108
    .line 109
    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 110
    .line 111
    new-instance v2, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 115
    .line 116
    const-string v10, "Camera is started. Side - "

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    move-result-object v10

    .line 127
    const/4 v12, 0x4

    .line 128
    const/4 v13, 0x0

    .line 129
    const/4 v11, 0x0

    .line 130
    .line 131
    .line 132
    invoke-static/range {v8 .. v13}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->i$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 133
    .line 134
    sget-object p1, Lcom/sumsub/sns/internal/core/analytics/e;->a:Lcom/sumsub/sns/internal/features/data/repository/analytics/a;

    .line 135
    .line 136
    sget-object p1, Lcom/sumsub/sns/internal/core/analytics/GlobalStatePayload;->IdDocType:Lcom/sumsub/sns/internal/core/analytics/GlobalStatePayload;

    .line 137
    .line 138
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->a:Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 139
    .line 140
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 141
    .line 142
    sget-object v8, Lcom/sumsub/sns/internal/core/analytics/e;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v8, p1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->a:Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 148
    .line 149
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->b:Ljava/lang/String;

    .line 150
    .line 151
    iget-object v8, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->K:Ljava/util/List;

    .line 152
    .line 153
    new-instance v9, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 157
    .line 158
    .line 159
    const-string/jumbo v10, "onPrepare: docType: "

    .line 160
    .line 161
    .line 162
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    const-string p1, ", idType: "

    .line 168
    .line 169
    .line 170
    invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    const-string p1, ", sides: "

    .line 176
    .line 177
    .line 178
    invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    move-result-object p1

    .line 186
    .line 187
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 188
    .line 189
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 190
    .line 191
    const-string v8, "DocCapture"

    .line 192
    .line 193
    .line 194
    invoke-virtual {v2, v8, p1, v7}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 195
    .line 196
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->k:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    .line 197
    .line 198
    if-eqz p1, :cond_7

    .line 199
    .line 200
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/utils/M;->l:Lcom/sumsub/sns/internal/features/presentation/utils/m;

    .line 201
    .line 202
    .line 203
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/utils/m;->a()Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 204
    move-result-object p1

    .line 205
    .line 206
    if-nez p1, :cond_8

    .line 207
    .line 208
    :cond_7
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->K:Ljava/util/List;

    .line 209
    .line 210
    .line 211
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 212
    move-result-object p1

    .line 213
    .line 214
    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 215
    .line 216
    if-nez p1, :cond_8

    .line 217
    .line 218
    sget-object p1, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->Front:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 219
    .line 220
    .line 221
    :cond_8
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->a(Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;)V

    .line 222
    .line 223
    .line 224
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 225
    move-result-object p1

    .line 226
    .line 227
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->q:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 228
    .line 229
    sget-object v8, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->U:[Lkotlin/reflect/KProperty;

    .line 230
    const/4 v9, 0x0

    .line 231
    .line 232
    aget-object v8, v8, v9

    .line 233
    .line 234
    iget-object v8, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 235
    .line 236
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v8, v2, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 240
    .line 241
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->k:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    .line 242
    .line 243
    if-eqz p1, :cond_9

    .line 244
    .line 245
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->j:Landroidx/lifecycle/SavedStateHandle;

    .line 246
    .line 247
    const-string v8, "EXTRA_COUNTRY_CODE"

    .line 248
    .line 249
    .line 250
    invoke-virtual {v2, v8}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 251
    move-result-object v2

    .line 252
    .line 253
    check-cast v2, Ljava/lang/String;

    .line 254
    .line 255
    iget-object v8, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->b:Ljava/lang/String;

    .line 256
    .line 257
    iput v5, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/R1;->e:I

    .line 258
    .line 259
    .line 260
    invoke-virtual {p1, v2, v8, v0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 261
    move-result-object p1

    .line 262
    .line 263
    if-ne p1, v1, :cond_9

    .line 264
    goto :goto_4

    .line 265
    .line 266
    :cond_9
    :goto_2
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->k:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    .line 267
    .line 268
    if-eqz p1, :cond_a

    .line 269
    .line 270
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->s:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 271
    .line 272
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->U:[Lkotlin/reflect/KProperty;

    .line 273
    .line 274
    aget-object v2, v2, v6

    .line 275
    .line 276
    .line 277
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 278
    move-result-object p1

    .line 279
    .line 280
    check-cast p1, Ljava/lang/Boolean;

    .line 281
    .line 282
    .line 283
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 284
    move-result p1

    .line 285
    .line 286
    if-eqz p1, :cond_a

    .line 287
    .line 288
    .line 289
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->k()V

    .line 290
    .line 291
    .line 292
    :cond_a
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->g()Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    .line 293
    move-result-object p1

    .line 294
    .line 295
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/R1;->a:Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    .line 296
    .line 297
    iput-object p0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/R1;->b:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;

    .line 298
    .line 299
    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/R1;->e:I

    .line 300
    .line 301
    .line 302
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 303
    move-result-object v2

    .line 304
    .line 305
    if-ne v2, v1, :cond_b

    .line 306
    goto :goto_4

    .line 307
    :cond_b
    move-object v4, p1

    .line 308
    move-object p1, v2

    .line 309
    move-object v2, p0

    .line 310
    .line 311
    :goto_3
    check-cast p1, Ljava/lang/Boolean;

    .line 312
    .line 313
    .line 314
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->F:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 317
    .line 318
    sget-object v5, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->U:[Lkotlin/reflect/KProperty;

    .line 319
    const/4 v6, 0x5

    .line 320
    .line 321
    aget-object v5, v5, v6

    .line 322
    .line 323
    iget-object v5, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 324
    .line 325
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v5, v2, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->g()Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    .line 332
    move-result-object p1

    .line 333
    .line 334
    if-eq p1, v4, :cond_c

    .line 335
    .line 336
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/k1;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/k1;

    .line 337
    .line 338
    .line 339
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 340
    .line 341
    :cond_c
    iput-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/R1;->a:Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    .line 342
    .line 343
    iput-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/R1;->b:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;

    .line 344
    .line 345
    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/R1;->e:I

    .line 346
    .line 347
    .line 348
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->g(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 349
    move-result-object p1

    .line 350
    .line 351
    if-ne p1, v1, :cond_d

    .line 352
    :goto_4
    return-object v1

    .line 353
    .line 354
    :cond_d
    :goto_5
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/S1;

    .line 355
    .line 356
    .line 357
    invoke-direct {p1, p0, v7}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/S1;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lkotlin/coroutines/Continuation;)V

    .line 358
    .line 359
    .line 360
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 361
    move-result-object v0

    .line 362
    .line 363
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/E1;

    .line 364
    .line 365
    .line 366
    invoke-direct {v3, p0, p1, v7}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/E1;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/S1;Lkotlin/coroutines/Continuation;)V

    .line 367
    const/4 v4, 0x3

    .line 368
    const/4 v5, 0x0

    .line 369
    const/4 v1, 0x0

    .line 370
    const/4 v2, 0x0

    .line 371
    .line 372
    .line 373
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 374
    .line 375
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 376
    return-object p1
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
