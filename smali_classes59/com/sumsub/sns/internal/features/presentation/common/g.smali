.class public abstract Lcom/sumsub/sns/internal/features/presentation/common/g;
.super Lcom/sumsub/sns/core/presentation/base/F;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V::",
        "Landroidx/viewbinding/ViewBinding;",
        "S:",
        "Lcom/sumsub/sns/core/presentation/base/V;",
        "VM:",
        "Lcom/sumsub/sns/internal/features/presentation/common/G;",
        ">",
        "Lcom/sumsub/sns/core/presentation/base/F<",
        "TV;TS;TVM;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008&\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u0001*\u0008\u0008\u0001\u0010\u0004*\u00020\u0003*\u0008\u0008\u0002\u0010\u0006*\u00020\u00052\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007B\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/presentation/common/g;",
        "Landroidx/viewbinding/ViewBinding;",
        "V",
        "Lcom/sumsub/sns/core/presentation/base/V;",
        "S",
        "Lcom/sumsub/sns/internal/features/presentation/common/G;",
        "VM",
        "Lcom/sumsub/sns/core/presentation/base/F;",
        "<init>",
        "()V",
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
        "SMAP\nSNSImageDocumentsAwareFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSImageDocumentsAwareFragment.kt\ncom/sumsub/sns/internal/features/presentation/common/SNSImageDocumentsAwareFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,258:1\n1#2:259\n*E\n"
    }
.end annotation


# static fields
.field public static final synthetic U:I


# instance fields
.field public a:Lcom/sumsub/sns/internal/core/presentation/android/y;

.field public final b:Lcom/sumsub/sns/internal/core/presentation/common/a;

.field public final c:Lcom/sumsub/sns/internal/features/presentation/utils/o;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/core/presentation/base/F;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/common/a;

    .line 6
    .line 7
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/common/d;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/common/d;-><init>(Lcom/sumsub/sns/internal/features/presentation/common/g;)V

    .line 11
    .line 12
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/common/e;

    .line 13
    .line 14
    .line 15
    invoke-direct {v2, p0}, Lcom/sumsub/sns/internal/features/presentation/common/e;-><init>(Lcom/sumsub/sns/internal/features/presentation/common/g;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, p0, v1, v2}, Lcom/sumsub/sns/internal/core/presentation/common/a;-><init>(Lcom/sumsub/sns/core/presentation/base/F;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    .line 19
    .line 20
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/common/g;->b:Lcom/sumsub/sns/internal/core/presentation/common/a;

    .line 21
    .line 22
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/utils/o;

    .line 23
    .line 24
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/common/f0;

    .line 25
    .line 26
    .line 27
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/common/f0;-><init>(Lcom/sumsub/sns/internal/features/presentation/common/g;)V

    .line 28
    .line 29
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/common/g0;

    .line 30
    .line 31
    .line 32
    invoke-direct {v2, p0}, Lcom/sumsub/sns/internal/features/presentation/common/g0;-><init>(Lcom/sumsub/sns/internal/features/presentation/common/g;)V

    .line 33
    .line 34
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/common/h0;

    .line 35
    .line 36
    .line 37
    invoke-direct {v3, p0}, Lcom/sumsub/sns/internal/features/presentation/common/h0;-><init>(Lcom/sumsub/sns/internal/features/presentation/common/g;)V

    .line 38
    .line 39
    .line 40
    invoke-direct {v0, v1, v2, v3}, Lcom/sumsub/sns/internal/features/presentation/utils/o;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 41
    .line 42
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/common/g;->c:Lcom/sumsub/sns/internal/features/presentation/utils/o;

    .line 43
    return-void
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

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/common/g;I)Lkotlin/Unit;
    .locals 5

    .line 2
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object v0

    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/Control;->DocumentField:Lcom/sumsub/sns/internal/core/analytics/Control;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const-string v3, "hasDocument"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;Lcom/sumsub/sns/internal/core/analytics/Popup;I)V

    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getViewModel$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/presentation/base/C;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/common/G;

    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/common/t;

    invoke-direct {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/common/t;-><init>(I)V

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/common/G;->intent(Lcom/sumsub/sns/core/presentation/base/Q;)V

    .line 4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/common/g;Lcom/sumsub/sns/internal/features/domain/documents/w;)Lkotlin/Unit;
    .locals 12

    .line 5
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object v0

    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/Control;->DocumentField:Lcom/sumsub/sns/internal/core/analytics/Control;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v3, "hasDocument"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;Lcom/sumsub/sns/internal/core/analytics/Popup;I)V

    .line 6
    iget-object v6, p1, Lcom/sumsub/sns/internal/features/domain/documents/w;->b:Ljava/io/File;

    if-eqz v6, :cond_0

    .line 7
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAppListener$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/common/u0;

    move-result-object v5

    if-eqz v5, :cond_0

    .line 8
    iget v7, p1, Lcom/sumsub/sns/internal/features/domain/documents/w;->c:I

    .line 9
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getIdDocSetType()Ljava/lang/String;

    move-result-object v8

    const/4 v10, 0x0

    const/16 v11, 0x30

    const/4 v9, 0x0

    .line 10
    invoke-static/range {v5 .. v11}, Lcom/sumsub/sns/internal/core/common/t0;->a(Lcom/sumsub/sns/internal/core/common/u0;Ljava/io/File;ILjava/lang/String;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/util/Map;I)V

    .line 11
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/common/g;Ljava/lang/String;Landroid/net/Uri;)Lkotlin/Unit;
    .locals 4

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez p2, :cond_0

    goto :goto_0

    .line 13
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getViewModel$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/presentation/base/C;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/common/G;

    .line 14
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/common/m;

    .line 15
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    .line 16
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/sumsub/sns/R$string;->sns_gallery_type:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 17
    invoke-direct {v0, v1, v2, p2}, Lcom/sumsub/sns/internal/features/presentation/common/m;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/net/Uri;)V

    .line 18
    invoke-virtual {p1, v0}, Lcom/sumsub/sns/internal/features/presentation/common/G;->intent(Lcom/sumsub/sns/core/presentation/base/Q;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 19
    sget-object p2, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {p0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_1

    const-string p2, ""

    .line 20
    :cond_1
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    invoke-virtual {v0, p0, p2, p1}, Lcom/sumsub/sns/internal/log/logger/k;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 21
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/common/g;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .line 22
    const-string/jumbo p1, "payload"

    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    .line 23
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getViewModel$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/presentation/base/C;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/common/G;

    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/common/o;

    sget-object v1, Lcom/sumsub/sns/core/presentation/base/l;->Companion:Lcom/sumsub/sns/core/presentation/base/h;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    const-string v1, "fragment_result_key"

    invoke-virtual {p2, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result p2

    const/4 v1, -0x1

    if-ne p2, v1, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 25
    :goto_0
    invoke-direct {v0, p2, p1}, Lcom/sumsub/sns/internal/features/presentation/common/o;-><init>(ZLandroid/os/Parcelable;)V

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/common/G;->intent(Lcom/sumsub/sns/core/presentation/base/Q;)V

    return-void
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/common/g;I)Lkotlin/Unit;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object v0

    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/Control;->DeleteButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "index"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;Lcom/sumsub/sns/internal/core/analytics/Popup;I)V

    .line 2
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/common/g;->a(I)V

    .line 3
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/common/g;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .line 4
    const-string p1, "DOCUMENT_RESULT"

    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 5
    const-string v0, "DOCUMENT_RESULTS"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/J;

    .line 6
    sget-object v1, Lcom/sumsub/sns/core/presentation/base/l;->Companion:Lcom/sumsub/sns/core/presentation/base/h;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    const-string v1, "fragment_result_key"

    invoke-virtual {p2, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result p2

    .line 8
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getViewModel$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/presentation/base/C;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/common/G;

    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/common/n;

    invoke-direct {v1, p1, v0, p2}, Lcom/sumsub/sns/internal/features/presentation/common/n;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/T;Lcom/sumsub/sns/internal/features/data/model/common/J;I)V

    invoke-virtual {p0, v1}, Lcom/sumsub/sns/internal/features/presentation/common/G;->intent(Lcom/sumsub/sns/core/presentation/base/Q;)V

    return-void
.end method

.method public static final c(Lcom/sumsub/sns/internal/features/presentation/common/g;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    const-string/jumbo p1, "result_data"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    check-cast p1, Lcom/sumsub/sns/internal/features/domain/documents/K;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getViewModel$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/presentation/base/C;

    .line 15
    move-result-object p0

    .line 16
    .line 17
    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/common/G;

    .line 18
    .line 19
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/common/p;

    .line 20
    .line 21
    .line 22
    invoke-direct {p2, p1}, Lcom/sumsub/sns/internal/features/presentation/common/p;-><init>(Lcom/sumsub/sns/internal/features/domain/documents/K;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p2}, Lcom/sumsub/sns/internal/features/presentation/common/G;->intent(Lcom/sumsub/sns/core/presentation/base/Q;)V

    .line 26
    :cond_0
    return-void
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
.end method

.method public static final d(Lcom/sumsub/sns/internal/features/presentation/common/g;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo p1, "rotation"

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2, p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 8
    move-result p1

    .line 9
    .line 10
    const-string v0, "file"

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 14
    move-result-object p2

    .line 15
    .line 16
    check-cast p2, Ljava/io/File;

    .line 17
    .line 18
    if-nez p2, :cond_0

    .line 19
    return-void

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getViewModel$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/presentation/base/C;

    .line 23
    move-result-object p0

    .line 24
    .line 25
    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/common/G;

    .line 26
    .line 27
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/common/k;

    .line 28
    .line 29
    .line 30
    invoke-direct {v0, p1, p2}, Lcom/sumsub/sns/internal/features/presentation/common/k;-><init>(ILjava/io/File;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/common/G;->intent(Lcom/sumsub/sns/core/presentation/base/Q;)V

    .line 34
    return-void
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
.end method


# virtual methods
.method public a(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract f()Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;
.end method

.method public final g()Ljava/lang/String;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getIdDocSetType()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    invoke-interface {v1}, Lkotlin/reflect/KClass;->getQualifiedName()Ljava/lang/String;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    new-instance v2, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    const-string v3, "instructions_request_key_"

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v0, "_"

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    move-result-object v0

    .line 42
    return-object v0
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

.method public handleEvent(Lcom/sumsub/sns/core/presentation/base/r;)V
    .locals 13

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/common/l;

    .line 3
    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/common/l;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget p1, p1, Lcom/sumsub/sns/internal/features/presentation/common/l;->a:I

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    if-nez p1, :cond_1

    .line 21
    :cond_0
    move-object v1, p0

    .line 22
    .line 23
    goto/16 :goto_0

    .line 24
    .line 25
    :cond_1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/common/g;->b:Lcom/sumsub/sns/internal/core/presentation/common/a;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/core/presentation/common/a;->a(Landroid/view/View;)V

    .line 29
    return-void

    .line 30
    .line 31
    :cond_2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/domain/documents/N;

    .line 32
    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAppListener$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/common/u0;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/common/g;->g()Ljava/lang/String;

    .line 43
    move-result-object v1

    .line 44
    .line 45
    check-cast p1, Lcom/sumsub/sns/internal/features/domain/documents/N;

    .line 46
    .line 47
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/domain/documents/N;->a:Lcom/sumsub/sns/internal/features/data/model/common/t2;

    .line 48
    .line 49
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/domain/documents/N;->b:Lcom/sumsub/sns/internal/features/domain/documents/B;

    .line 50
    .line 51
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;

    .line 52
    .line 53
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->e:Landroidx/lifecycle/ViewModelLazy;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Landroidx/lifecycle/ViewModelLazy;->getValue()Ljava/lang/Object;

    .line 57
    move-result-object v0

    .line 58
    .line 59
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/main/i2;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v2, p1, v1}, Lcom/sumsub/sns/internal/features/presentation/main/i2;->a(Lcom/sumsub/sns/internal/features/data/model/common/t2;Landroid/os/Parcelable;Ljava/lang/String;)V

    .line 63
    return-void

    .line 64
    .line 65
    :cond_3
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/domain/documents/y;

    .line 66
    .line 67
    if-eqz v0, :cond_4

    .line 68
    .line 69
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->o:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/y;

    .line 70
    .line 71
    check-cast p1, Lcom/sumsub/sns/internal/features/domain/documents/y;

    .line 72
    .line 73
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/domain/documents/y;->a:Lcom/sumsub/sns/internal/features/domain/documents/M;

    .line 74
    .line 75
    iget-boolean v2, v1, Lcom/sumsub/sns/internal/features/domain/documents/M;->a:Z

    .line 76
    .line 77
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/domain/documents/M;->b:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 81
    move-result-object v3

    .line 82
    .line 83
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/domain/documents/y;->a:Lcom/sumsub/sns/internal/features/domain/documents/M;

    .line 84
    .line 85
    iget-object v4, p1, Lcom/sumsub/sns/internal/features/domain/documents/M;->c:Ljava/util/List;

    .line 86
    .line 87
    iget-boolean v5, p1, Lcom/sumsub/sns/internal/features/domain/documents/M;->d:Z

    .line 88
    .line 89
    iget-object v6, p1, Lcom/sumsub/sns/internal/features/domain/documents/M;->e:Ljava/lang/String;

    .line 90
    .line 91
    iget-object v7, p1, Lcom/sumsub/sns/internal/features/domain/documents/M;->g:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;

    .line 92
    .line 93
    iget-boolean v8, p1, Lcom/sumsub/sns/internal/features/domain/documents/M;->f:Z

    .line 94
    .line 95
    iget-object v9, p1, Lcom/sumsub/sns/internal/features/domain/documents/M;->h:Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    const/4 v11, 0x0

    .line 100
    const/4 v10, 0x0

    .line 101
    .line 102
    .line 103
    invoke-static/range {v2 .. v11}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/y;->a(ZLcom/sumsub/sns/internal/features/data/model/common/X;Ljava/util/List;ZLjava/lang/String;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;ZLjava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/Document;Z)Lcom/sumsub/sns/core/presentation/base/I;

    .line 104
    move-result-object p1

    .line 105
    .line 106
    .line 107
    const-string/jumbo v0, "request_photo_picker"

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1, v0}, Lcom/sumsub/sns/core/presentation/base/l;->forResult(Ljava/lang/String;)Lcom/sumsub/sns/core/presentation/base/l;

    .line 111
    move-result-object v2

    .line 112
    const/4 v5, 0x4

    .line 113
    const/4 v6, 0x0

    .line 114
    .line 115
    const-string v3, "SNSPhotoDocumentPickerFragment2"

    .line 116
    const/4 v4, 0x0

    .line 117
    move-object v1, p0

    .line 118
    .line 119
    .line 120
    invoke-static/range {v1 .. v6}, Lcom/sumsub/sns/core/presentation/base/l;->navigateTo$idensic_mobile_sdk_aar_defaultRelease$default(Lcom/sumsub/sns/core/presentation/base/l;Landroidx/fragment/app/Fragment;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 121
    return-void

    .line 122
    .line 123
    :cond_4
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/common/s;

    .line 124
    .line 125
    if-eqz v0, :cond_5

    .line 126
    .line 127
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/common/s;

    .line 128
    .line 129
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/common/s;->a:Lcom/sumsub/sns/internal/features/domain/documents/D;

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getIdDocSetType()Ljava/lang/String;

    .line 133
    move-result-object v0

    .line 134
    .line 135
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/f;

    .line 136
    .line 137
    .line 138
    invoke-direct {v1}, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/f;-><init>()V

    .line 139
    .line 140
    const-string v2, "image_data"

    .line 141
    .line 142
    .line 143
    invoke-static {v2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 144
    move-result-object p1

    .line 145
    .line 146
    const-string v2, "doc_set_type"

    .line 147
    .line 148
    .line 149
    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 150
    move-result-object v0

    .line 151
    .line 152
    .line 153
    filled-new-array {p1, v0}, [Lkotlin/Pair;

    .line 154
    move-result-object p1

    .line 155
    .line 156
    .line 157
    invoke-static {p1}, Landroidx/core/os/BundleKt;->bundleOf([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 158
    move-result-object p1

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1, p1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 162
    .line 163
    .line 164
    const-string/jumbo p1, "request_photo_viewer"

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1, p1}, Lcom/sumsub/sns/core/presentation/base/l;->forResult(Ljava/lang/String;)Lcom/sumsub/sns/core/presentation/base/l;

    .line 168
    move-result-object v8

    .line 169
    const/4 v11, 0x4

    .line 170
    const/4 v12, 0x0

    .line 171
    .line 172
    const-string v9, "SNSSimpleDocumentViewerFragment"

    .line 173
    const/4 v10, 0x0

    .line 174
    move-object v7, p0

    .line 175
    .line 176
    .line 177
    invoke-static/range {v7 .. v12}, Lcom/sumsub/sns/core/presentation/base/l;->navigateTo$idensic_mobile_sdk_aar_defaultRelease$default(Lcom/sumsub/sns/core/presentation/base/l;Landroidx/fragment/app/Fragment;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 178
    move-object v1, v7

    .line 179
    return-void

    .line 180
    :cond_5
    move-object v1, p0

    .line 181
    .line 182
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/common/q;

    .line 183
    .line 184
    if-eqz v0, :cond_7

    .line 185
    .line 186
    iget-object p1, v1, Lcom/sumsub/sns/internal/features/presentation/common/g;->a:Lcom/sumsub/sns/internal/core/presentation/android/y;

    .line 187
    .line 188
    if-eqz p1, :cond_6

    .line 189
    .line 190
    .line 191
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 192
    move-result-wide v2

    .line 193
    .line 194
    .line 195
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 196
    move-result-object v0

    .line 197
    .line 198
    .line 199
    invoke-virtual {p1, v0}, Lcom/sumsub/sns/internal/core/presentation/android/y;->a(Ljava/lang/String;)Z

    .line 200
    move-result p1

    .line 201
    .line 202
    if-nez p1, :cond_6

    .line 203
    .line 204
    .line 205
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getViewModel$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/presentation/base/C;

    .line 206
    move-result-object p1

    .line 207
    .line 208
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/common/G;

    .line 209
    .line 210
    .line 211
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    :cond_6
    :goto_0
    return-void

    .line 213
    .line 214
    .line 215
    :cond_7
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/l;->handleEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 216
    return-void
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

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/l;->onCreate(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 7
    move-result-object v2

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->getActivityResultRegistry()Landroidx/activity/result/ActivityResultRegistry;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    sget v3, Lcom/sumsub/sns/R$string;->sns_gallery_type:I

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, Lcom/sumsub/sns/internal/core/common/c;->a(Ljava/lang/String;)[Ljava/lang/String;

    .line 29
    move-result-object v3

    .line 30
    .line 31
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/android/y;

    .line 32
    .line 33
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/common/i0;

    .line 34
    .line 35
    .line 36
    invoke-direct {v4, p0}, Lcom/sumsub/sns/internal/features/presentation/common/i0;-><init>(Lcom/sumsub/sns/internal/features/presentation/common/g;)V

    .line 37
    .line 38
    const-string v5, "TYPE_UNKNOWN"

    .line 39
    .line 40
    .line 41
    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/internal/core/presentation/android/y;-><init>(Landroidx/activity/result/ActivityResultRegistry;Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function2;Ljava/lang/String;)V

    .line 42
    .line 43
    if-eqz p1, :cond_0

    .line 44
    .line 45
    const-string v1, "last_picker_request_id"

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    move-result-object p1

    .line 50
    .line 51
    if-eqz p1, :cond_0

    .line 52
    .line 53
    iput-object p1, v0, Lcom/sumsub/sns/internal/core/presentation/android/y;->h:Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    .line 57
    move-result-object p1

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v0}, Landroidx/lifecycle/Lifecycle;->addObserver(Landroidx/lifecycle/LifecycleObserver;)V

    .line 61
    .line 62
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/common/g;->a:Lcom/sumsub/sns/internal/core/presentation/android/y;

    .line 63
    return-void
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

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/l;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/common/g;->a:Lcom/sumsub/sns/internal/core/presentation/android/y;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/android/y;->h:Ljava/lang/String;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string v1, "last_picker_request_id"

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    :cond_0
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/sumsub/sns/core/presentation/base/F;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

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
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/common/j0;

    .line 14
    .line 15
    .line 16
    invoke-direct {p2, p0}, Lcom/sumsub/sns/internal/features/presentation/common/j0;-><init>(Lcom/sumsub/sns/internal/features/presentation/common/g;)V

    .line 17
    .line 18
    .line 19
    const-string/jumbo v0, "request_photo_picker"

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v0, p0, p2}, Landroidx/fragment/app/FragmentManager;->setFragmentResultListener(Ljava/lang/String;Landroidx/lifecycle/LifecycleOwner;Landroidx/fragment/app/FragmentResultListener;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/common/k0;

    .line 33
    .line 34
    .line 35
    invoke-direct {p2, p0}, Lcom/sumsub/sns/internal/features/presentation/common/k0;-><init>(Lcom/sumsub/sns/internal/features/presentation/common/g;)V

    .line 36
    .line 37
    .line 38
    const-string/jumbo v0, "request_photo_viewer"

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v0, p0, p2}, Landroidx/fragment/app/FragmentManager;->setFragmentResultListener(Ljava/lang/String;Landroidx/lifecycle/LifecycleOwner;Landroidx/fragment/app/FragmentResultListener;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 45
    move-result-object p1

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 49
    move-result-object p1

    .line 50
    .line 51
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/common/l0;

    .line 52
    .line 53
    .line 54
    invoke-direct {p2, p0}, Lcom/sumsub/sns/internal/features/presentation/common/l0;-><init>(Lcom/sumsub/sns/internal/features/presentation/common/g;)V

    .line 55
    .line 56
    .line 57
    const-string/jumbo v0, "request_image_rotation"

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v0, p0, p2}, Landroidx/fragment/app/FragmentManager;->setFragmentResultListener(Ljava/lang/String;Landroidx/lifecycle/LifecycleOwner;Landroidx/fragment/app/FragmentResultListener;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 64
    move-result-object p1

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 68
    move-result-object p1

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/common/g;->g()Ljava/lang/String;

    .line 72
    move-result-object p2

    .line 73
    .line 74
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/common/m0;

    .line 75
    .line 76
    .line 77
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/common/m0;-><init>(Lcom/sumsub/sns/internal/features/presentation/common/g;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, p2, p0, v0}, Landroidx/fragment/app/FragmentManager;->setFragmentResultListener(Ljava/lang/String;Landroidx/lifecycle/LifecycleOwner;Landroidx/fragment/app/FragmentResultListener;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getViewModel$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/presentation/base/C;

    .line 84
    move-result-object p1

    .line 85
    .line 86
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/common/G;

    .line 87
    .line 88
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/common/G;->d:Lkotlinx/coroutines/flow/n;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 92
    move-result-object p2

    .line 93
    .line 94
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/common/f;

    .line 95
    const/4 v1, 0x0

    .line 96
    .line 97
    .line 98
    invoke-direct {v0, p0, v1}, Lcom/sumsub/sns/internal/features/presentation/common/f;-><init>(Lcom/sumsub/sns/internal/features/presentation/common/g;Lkotlin/coroutines/Continuation;)V

    .line 99
    .line 100
    .line 101
    invoke-static {p1, p2, v0}, Lcom/sumsub/sns/internal/core/common/U;->b(Lkotlinx/coroutines/flow/e;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 102
    return-void
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
