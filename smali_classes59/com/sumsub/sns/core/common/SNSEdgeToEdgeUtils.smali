.class public final Lcom/sumsub/sns/core/common/SNSEdgeToEdgeUtils;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000c\u0010\u0008\u001a\u00020\u0005*\u00020\tH\u0002\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/sumsub/sns/core/common/SNSEdgeToEdgeUtils;",
        "",
        "<init>",
        "()V",
        "applyEdgeToEdge",
        "",
        "activity",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "applyEdgeToEdgeApi35Fix",
        "Landroid/view/View;",
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
        "SMAP\nSNSEdgeToEdgeUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSEdgeToEdgeUtils.kt\ncom/sumsub/sns/core/common/SNSEdgeToEdgeUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,47:1\n1#2:48\n163#3,2:49\n*S KotlinDebug\n*F\n+ 1 SNSEdgeToEdgeUtils.kt\ncom/sumsub/sns/core/common/SNSEdgeToEdgeUtils\n*L\n36#1:49,2\n*E\n"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/sumsub/sns/core/common/SNSEdgeToEdgeUtils;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/core/common/SNSEdgeToEdgeUtils;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/core/common/SNSEdgeToEdgeUtils;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sns/core/common/SNSEdgeToEdgeUtils;->INSTANCE:Lcom/sumsub/sns/core/common/SNSEdgeToEdgeUtils;

    .line 8
    return-void
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

.method private constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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

.method public static synthetic a(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/sumsub/sns/core/common/SNSEdgeToEdgeUtils;->applyEdgeToEdgeApi35Fix$lambda$3(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method private final applyEdgeToEdgeApi35Fix(Landroid/view/View;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    new-instance v0, Lcom/sumsub/sns/core/common/b;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Lcom/sumsub/sns/core/common/b;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-static {p1, v0}, Landroidx/core/view/ViewCompat;->setOnApplyWindowInsetsListener(Landroid/view/View;Landroidx/core/view/OnApplyWindowInsetsListener;)V

    .line 13
    return-void
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
.end method

.method private static final applyEdgeToEdgeApi35Fix$lambda$3(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->systemBars()I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->displayCutout()I

    .line 8
    move-result v1

    .line 9
    or-int/2addr v0, v1

    .line 10
    .line 11
    .line 12
    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->ime()I

    .line 13
    move-result v1

    .line 14
    or-int/2addr v0, v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0}, Landroidx/core/view/WindowInsetsCompat;->getInsets(I)Landroidx/core/graphics/Insets;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    iget v0, p1, Landroidx/core/graphics/Insets;->left:I

    .line 21
    .line 22
    iget v1, p1, Landroidx/core/graphics/Insets;->right:I

    .line 23
    .line 24
    iget v2, p1, Landroidx/core/graphics/Insets;->top:I

    .line 25
    .line 26
    iget p1, p1, Landroidx/core/graphics/Insets;->bottom:I

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v0, v2, v1, p1}, Landroid/view/View;->setPadding(IIII)V

    .line 30
    .line 31
    sget-object p0, Landroidx/core/view/WindowInsetsCompat;->CONSUMED:Landroidx/core/view/WindowInsetsCompat;

    .line 32
    return-object p0
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method


# virtual methods
.method public final applyEdgeToEdge(Landroidx/appcompat/app/AppCompatActivity;)V
    .locals 3
    .param p1    # Landroidx/appcompat/app/AppCompatActivity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 3
    .line 4
    const/16 v1, 0x23

    .line 5
    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    goto :goto_1

    .line 8
    .line 9
    :cond_0
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 10
    .line 11
    .line 12
    const v0, 0x1020002

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    .line 24
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 25
    .line 26
    .line 27
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    .line 35
    :goto_0
    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    .line 36
    move-result v0

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    move-object v0, p1

    .line 40
    .line 41
    check-cast v0, Landroid/view/View;

    .line 42
    .line 43
    sget-object v1, Lcom/sumsub/sns/core/common/SNSEdgeToEdgeUtils;->INSTANCE:Lcom/sumsub/sns/core/common/SNSEdgeToEdgeUtils;

    .line 44
    .line 45
    .line 46
    invoke-direct {v1, v0}, Lcom/sumsub/sns/core/common/SNSEdgeToEdgeUtils;->applyEdgeToEdgeApi35Fix(Landroid/view/View;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 50
    move-result-object p1

    .line 51
    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 55
    .line 56
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 57
    .line 58
    const-string v1, "SDK"

    .line 59
    .line 60
    const-string v2, "Failed to apply edge to edge fix to Sumsub activity"

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1, v2, p1}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 64
    :cond_2
    :goto_1
    return-void
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
