.class public final Lcom/sumsub/sns/core/theme/SNSJsonCustomizationImpl;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/core/theme/SNSJsonCustomization;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/sumsub/sns/core/theme/SNSJsonCustomizationImpl;",
        "Lcom/sumsub/sns/core/theme/SNSJsonCustomization;",
        "<init>",
        "()V",
        "Lcom/sumsub/sns/core/theme/SNSTheme;",
        "theme",
        "",
        "loadTheme",
        "(Lcom/sumsub/sns/core/theme/SNSTheme;)V",
        "Landroid/content/Context;",
        "context",
        "loadResources",
        "(Landroid/content/Context;)V",
        "Lcom/sumsub/sns/internal/core/presentation/theme/p;",
        "getTheme",
        "()Lcom/sumsub/sns/internal/core/presentation/theme/p;",
        "Lcom/sumsub/sns/internal/core/presentation/theme/p;",
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


# instance fields
.field private theme:Lcom/sumsub/sns/internal/core/presentation/theme/p;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
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


# virtual methods
.method public bridge synthetic getTheme()Lcom/sumsub/sns/core/theme/SNSCustomizationTheme;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/sumsub/sns/core/theme/SNSJsonCustomizationImpl;->getTheme()Lcom/sumsub/sns/internal/core/presentation/theme/p;

    move-result-object v0

    return-object v0
.end method

.method public getTheme()Lcom/sumsub/sns/internal/core/presentation/theme/p;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/theme/SNSJsonCustomizationImpl;->theme:Lcom/sumsub/sns/internal/core/presentation/theme/p;

    return-object v0
.end method

.method public loadResources(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/theme/SNSJsonCustomizationImpl;->theme:Lcom/sumsub/sns/internal/core/presentation/theme/p;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/core/presentation/theme/p;->a(Landroid/content/Context;)V

    .line 8
    :cond_0
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public loadTheme(Lcom/sumsub/sns/core/theme/SNSTheme;)V
    .locals 6
    .param p1    # Lcom/sumsub/sns/core/theme/SNSTheme;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 3
    .line 4
    .line 5
    invoke-static {p0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    move-result-object v1

    .line 7
    const/4 v4, 0x4

    .line 8
    const/4 v5, 0x0

    .line 9
    .line 10
    const-string v2, "Loading native theme"

    .line 11
    const/4 v3, 0x0

    .line 12
    .line 13
    .line 14
    invoke-static/range {v0 .. v5}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->d$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 15
    .line 16
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    .line 17
    .line 18
    sget-object v1, Lcom/sumsub/sns/core/theme/SNSCustomizationFileFormat;->NATIVE:Lcom/sumsub/sns/core/theme/SNSCustomizationFileFormat;

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v1}, Lcom/sumsub/sns/internal/core/presentation/theme/p;-><init>(Lcom/sumsub/sns/core/theme/SNSCustomizationFileFormat;)V

    .line 22
    .line 23
    .line 24
    invoke-static {v0, p1}, Lcom/sumsub/sns/internal/core/presentation/theme/p;->a(Lcom/sumsub/sns/internal/core/presentation/theme/p;Lcom/sumsub/sns/core/theme/SNSTheme;)V

    .line 25
    .line 26
    iput-object v0, p0, Lcom/sumsub/sns/core/theme/SNSJsonCustomizationImpl;->theme:Lcom/sumsub/sns/internal/core/presentation/theme/p;

    .line 27
    return-void
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
.end method
