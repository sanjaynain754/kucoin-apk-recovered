.class public interface abstract Lcom/sumsub/sns/core/theme/SNSTheme;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008g\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H&J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0003H&J\u0014\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0003H&\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/sumsub/sns/core/theme/SNSTheme;",
        "",
        "getMetrics",
        "",
        "Lcom/sumsub/sns/core/theme/SNSMetricElement;",
        "getFonts",
        "Lcom/sumsub/sns/core/theme/SNSTypographyElement;",
        "Lcom/sumsub/sns/core/theme/SNSThemeFont;",
        "getColors",
        "Lcom/sumsub/sns/core/theme/SNSColorElement;",
        "Lcom/sumsub/sns/core/theme/SNSThemeColor;",
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


# virtual methods
.method public abstract getColors()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/sumsub/sns/core/theme/SNSColorElement;",
            "Lcom/sumsub/sns/core/theme/SNSThemeColor;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getFonts()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/sumsub/sns/core/theme/SNSTypographyElement;",
            "Lcom/sumsub/sns/core/theme/SNSThemeFont;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getMetrics()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/sumsub/sns/core/theme/SNSMetricElement;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
