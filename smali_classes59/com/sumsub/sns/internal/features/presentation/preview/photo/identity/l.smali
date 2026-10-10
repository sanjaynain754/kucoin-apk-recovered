.class public final Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/l;
.super Lcom/sumsub/sns/internal/features/presentation/preview/photo/m;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sumsub/sns/internal/features/presentation/preview/photo/m<",
        "Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/t;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/l;",
        "Lcom/sumsub/sns/internal/features/presentation/preview/photo/m;",
        "Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/t;",
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
        "SMAP\nSNSPreviewIdentityDocumentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSPreviewIdentityDocumentFragment.kt\ncom/sumsub/sns/internal/features/presentation/preview/photo/identity/SNSPreviewIdentityDocumentFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,134:1\n106#2,15:135\n*S KotlinDebug\n*F\n+ 1 SNSPreviewIdentityDocumentFragment.kt\ncom/sumsub/sns/internal/features/presentation/preview/photo/identity/SNSPreviewIdentityDocumentFragment\n*L\n23#1:135,15\n*E\n"
    }
.end annotation


# static fields
.field public static final synthetic U:I


# instance fields
.field public final u:Lkotlin/Lazy;


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/m;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/k;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/k;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/l;)V

    .line 9
    .line 10
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/g;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/g;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/l;)V

    .line 14
    .line 15
    sget-object v2, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 16
    .line 17
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/h;

    .line 18
    .line 19
    .line 20
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/h;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/g;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v2, v3}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/t;

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/i;

    .line 33
    .line 34
    .line 35
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/i;-><init>(Lkotlin/Lazy;)V

    .line 36
    .line 37
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/j;

    .line 38
    .line 39
    .line 40
    invoke-direct {v4, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/j;-><init>(Lkotlin/Lazy;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p0, v2, v3, v4, v0}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/l;->u:Lkotlin/Lazy;

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

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/l;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 4

    .line 1
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/u;

    .line 2
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

    .line 3
    :goto_0
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getServiceLocator$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/domain/h;

    move-result-object v2

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v3

    .line 5
    invoke-direct {v0, v1, p0, v2, v3}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/u;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/l;Lcom/sumsub/sns/internal/core/domain/h;Landroid/os/Bundle;)V

    return-object v0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/l;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 13

    .line 6
    sget-object p1, Lcom/sumsub/sns/core/presentation/base/l;->Companion:Lcom/sumsub/sns/core/presentation/base/h;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2}, Lcom/sumsub/sns/core/presentation/base/h;->a(Landroid/os/Bundle;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 7
    const-string/jumbo p1, "result_selected_country"

    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 8
    const-string/jumbo v0, "result_selected_id_doc_type"

    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 9
    const-string/jumbo v1, "result_selected_ekyc_source"

    invoke-virtual {p2, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 10
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/g;

    invoke-static {v1}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Document selected: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 11
    sget-object v4, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 12
    iget-object v5, v4, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    const/4 v6, 0x0

    .line 13
    invoke-virtual {v5, v2, v3, v6}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    if-nez p1, :cond_0

    .line 14
    invoke-static {v1}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 15
    iget-object p2, v4, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 16
    const-string v0, "Country is null, finish"

    invoke-virtual {p2, p1, v0, v6}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v11, 0x7

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v7, p0

    .line 17
    invoke-static/range {v7 .. v12}, Lcom/sumsub/sns/core/presentation/base/l;->finish$idensic_mobile_sdk_aar_defaultRelease$default(Lcom/sumsub/sns/core/presentation/base/l;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;ILjava/lang/Object;)V

    return-void

    :cond_0
    move-object v7, p0

    if-eqz v0, :cond_1

    .line 18
    invoke-static {v1}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Selected ID Document Type: "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 19
    iget-object v1, v4, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 20
    invoke-virtual {v1, p0, p2, v6}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 21
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    iget-object p0, v7, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/l;->u:Lkotlin/Lazy;

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/t;

    .line 23
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v7

    new-instance v10, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/o;

    invoke-direct {v10, p0, p1, v0, v6}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/o;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/t;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 v11, 0x3

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v7 .. v12}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void

    :cond_1
    if-eqz p2, :cond_2

    .line 25
    invoke-static {v1}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Selected eKYC source: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 26
    iget-object v1, v4, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 27
    invoke-virtual {v1, p0, v0, v6}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 28
    iget-object p0, v7, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/l;->u:Lkotlin/Lazy;

    .line 29
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/t;

    .line 30
    invoke-virtual {p0, p1, p2}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/t;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 31
    :cond_2
    invoke-static {v1}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    .line 32
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Selected country: "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", ID Document Type: "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 33
    iget-object p2, v4, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 34
    invoke-virtual {p2, p0, p1, v6}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_3
    move-object v7, p0

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v7

    .line 35
    invoke-static/range {v0 .. v5}, Lcom/sumsub/sns/core/presentation/base/l;->finish$idensic_mobile_sdk_aar_defaultRelease$default(Lcom/sumsub/sns/core/presentation/base/l;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;ILjava/lang/Object;)V

    return-void
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/l;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 7

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/l;->u:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object p0

    .line 7
    move-object v0, p0

    .line 8
    .line 9
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/t;

    .line 10
    .line 11
    sget-object p0, Lcom/sumsub/sns/core/presentation/base/l;->Companion:Lcom/sumsub/sns/core/presentation/base/h;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {p2}, Lcom/sumsub/sns/core/presentation/base/h;->a(Landroid/os/Bundle;)Z

    .line 18
    move-result p0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    new-instance v1, Lcom/sumsub/sns/internal/core/common/t;

    .line 26
    const/4 p0, 0x1

    .line 27
    .line 28
    .line 29
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/core/common/t;-><init>(Z)V

    .line 30
    .line 31
    const/16 v5, 0xe

    .line 32
    const/4 v6, 0x0

    .line 33
    const/4 v2, 0x0

    .line 34
    const/4 v3, 0x0

    .line 35
    const/4 v4, 0x0

    .line 36
    .line 37
    .line 38
    invoke-static/range {v0 .. v6}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    .line 39
    return-void

    .line 40
    .line 41
    .line 42
    :cond_0
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 43
    move-result-object v1

    .line 44
    .line 45
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/p;

    .line 46
    const/4 p0, 0x0

    .line 47
    .line 48
    .line 49
    invoke-direct {v4, v0, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/p;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/t;Lkotlin/coroutines/Continuation;)V

    .line 50
    const/4 v5, 0x3

    .line 51
    const/4 v6, 0x0

    .line 52
    const/4 v2, 0x0

    .line 53
    const/4 v3, 0x0

    .line 54
    .line 55
    .line 56
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 57
    return-void
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
.method public final getIdDocSetType()Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string v2, "ARGS_DOCUMENT"

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object v0, v1

    .line 18
    .line 19
    :goto_0
    if-eqz v0, :cond_1

    .line 20
    move-object v1, v0

    .line 21
    .line 22
    :cond_1
    if-eqz v1, :cond_3

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 31
    .line 32
    if-nez v0, :cond_2

    .line 33
    goto :goto_1

    .line 34
    :cond_2
    return-object v0

    .line 35
    .line 36
    :cond_3
    :goto_1
    const-string v0, "TYPE_UNKNOWN"

    .line 37
    return-object v0
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
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/l;->u:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/t;

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
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/n;

    .line 3
    .line 4
    const/16 v1, 0xc

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAppListener$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/common/u0;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/n;

    .line 16
    .line 17
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/n;->a:Ljava/lang/String;

    .line 18
    .line 19
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/n;->b:Ljava/lang/String;

    .line 20
    .line 21
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;

    .line 22
    .line 23
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;

    .line 24
    .line 25
    .line 26
    invoke-direct {v4}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;-><init>()V

    .line 27
    .line 28
    new-instance v5, Landroid/os/Bundle;

    .line 29
    .line 30
    .line 31
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 32
    .line 33
    const-string v6, "extra_document_type"

    .line 34
    .line 35
    .line 36
    invoke-virtual {v5, v6, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    if-eqz p1, :cond_0

    .line 39
    .line 40
    const-string v3, "extra_prefill_country"

    .line 41
    .line 42
    .line 43
    invoke-virtual {v5, v3, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    invoke-virtual {v4, v5}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 47
    .line 48
    .line 49
    const-string/jumbo p1, "pick_document"

    .line 50
    .line 51
    .line 52
    invoke-virtual {v4, p1}, Lcom/sumsub/sns/core/presentation/base/l;->forResult(Ljava/lang/String;)Lcom/sumsub/sns/core/presentation/base/l;

    .line 53
    move-result-object p1

    .line 54
    .line 55
    const-string v3, "SNSDocumentSelectorFragment"

    .line 56
    .line 57
    .line 58
    invoke-static {v0, p1, v3, v2, v1}, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->a(Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;Landroidx/fragment/app/Fragment;Ljava/lang/String;ZI)V

    .line 59
    return-void

    .line 60
    .line 61
    :cond_1
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/m;

    .line 62
    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAppListener$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/common/u0;

    .line 67
    move-result-object v0

    .line 68
    .line 69
    if-eqz v0, :cond_2

    .line 70
    .line 71
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/m;

    .line 72
    .line 73
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/m;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 74
    .line 75
    iget-object v4, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/m;->b:Ljava/lang/String;

    .line 76
    .line 77
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/m;->c:Ljava/lang/String;

    .line 78
    .line 79
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;

    .line 80
    .line 81
    sget-object v5, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->v:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/c;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;

    .line 87
    .line 88
    .line 89
    invoke-direct {v5}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;-><init>()V

    .line 90
    .line 91
    new-instance v6, Landroid/os/Bundle;

    .line 92
    .line 93
    .line 94
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 95
    .line 96
    const-string v7, "ARGS_DOCUMENT"

    .line 97
    .line 98
    .line 99
    invoke-virtual {v6, v7, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 100
    .line 101
    const-string v3, "args_country"

    .line 102
    .line 103
    .line 104
    invoke-virtual {v6, v3, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    .line 106
    const-string v3, "args_source_id"

    .line 107
    .line 108
    .line 109
    invoke-virtual {v6, v3, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v5, v6}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 113
    .line 114
    const-string p1, "ekyc_for_iddocset"

    .line 115
    .line 116
    .line 117
    invoke-virtual {v5, p1}, Lcom/sumsub/sns/core/presentation/base/l;->forResult(Ljava/lang/String;)Lcom/sumsub/sns/core/presentation/base/l;

    .line 118
    move-result-object p1

    .line 119
    .line 120
    const-string v3, "SNSEkycFragment"

    .line 121
    .line 122
    .line 123
    invoke-static {v0, p1, v3, v2, v1}, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->a(Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;Landroidx/fragment/app/Fragment;Ljava/lang/String;ZI)V

    .line 124
    :cond_2
    return-void

    .line 125
    .line 126
    .line 127
    :cond_3
    invoke-super {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/m;->handleEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 128
    return-void
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

.method public final l()V
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/l;->u:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/t;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/q;

    .line 18
    const/4 v2, 0x0

    .line 19
    .line 20
    .line 21
    invoke-direct {v4, v0, v2}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/q;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/t;Lkotlin/coroutines/Continuation;)V

    .line 22
    const/4 v5, 0x3

    .line 23
    const/4 v6, 0x0

    .line 24
    const/4 v3, 0x0

    .line 25
    .line 26
    .line 27
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 28
    return-void
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

.method public final onFinishCalled(Lcom/sumsub/sns/internal/core/common/w;)Z
    .locals 11

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/m;->onFinishCalled(Lcom/sumsub/sns/internal/core/common/w;)Z

    .line 4
    .line 5
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/l;->u:Lkotlin/Lazy;

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/t;

    .line 12
    .line 13
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/t;->n:Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/e;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/e;->j()Z

    .line 17
    move-result p1

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/l;->u:Lkotlin/Lazy;

    .line 22
    .line 23
    .line 24
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/t;

    .line 28
    .line 29
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/t;->n:Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/e;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    sget-object v1, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->Front:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 35
    .line 36
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->l:Lcom/sumsub/sns/internal/features/presentation/utils/m;

    .line 37
    .line 38
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/presentation/utils/m;->c:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 39
    .line 40
    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/utils/m;->e:[Lkotlin/reflect/KProperty;

    .line 41
    const/4 v4, 0x0

    .line 42
    .line 43
    aget-object v3, v3, v4

    .line 44
    .line 45
    iget-object v3, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 46
    .line 47
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3, v2, v1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    .line 54
    move-result-object v1

    .line 55
    .line 56
    .line 57
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    .line 58
    move-result-object v1

    .line 59
    .line 60
    .line 61
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(Ljava/util/List;)V

    .line 65
    .line 66
    .line 67
    invoke-static {p1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 68
    move-result-object v5

    .line 69
    .line 70
    new-instance v8, Lcom/sumsub/sns/internal/features/presentation/preview/photo/F;

    .line 71
    const/4 v0, 0x0

    .line 72
    .line 73
    .line 74
    invoke-direct {v8, p1, v0, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/F;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;Lcom/sumsub/sns/internal/features/data/model/common/T;Lkotlin/coroutines/Continuation;)V

    .line 75
    const/4 v9, 0x3

    .line 76
    const/4 v10, 0x0

    .line 77
    const/4 v6, 0x0

    .line 78
    const/4 v7, 0x0

    .line 79
    .line 80
    .line 81
    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 82
    return v4

    .line 83
    :cond_0
    const/4 p1, 0x1

    .line 84
    return p1
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

.method public final onViewModelPrepared(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/m;->onViewModelPrepared(Landroid/os/Bundle;)V

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
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/v;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/v;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/l;)V

    .line 17
    .line 18
    .line 19
    const-string/jumbo v1, "pick_document"

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v1, p0, v0}, Landroidx/fragment/app/FragmentManager;->setFragmentResultListener(Ljava/lang/String;Landroidx/lifecycle/LifecycleOwner;Landroidx/fragment/app/FragmentResultListener;)V

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
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/w;

    .line 33
    .line 34
    .line 35
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/w;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/l;)V

    .line 36
    .line 37
    const-string v1, "ekyc_for_iddocset"

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v1, p0, v0}, Landroidx/fragment/app/FragmentManager;->setFragmentResultListener(Ljava/lang/String;Landroidx/lifecycle/LifecycleOwner;Landroidx/fragment/app/FragmentResultListener;)V

    .line 41
    return-void
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
.end method
