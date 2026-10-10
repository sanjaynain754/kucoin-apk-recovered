.class public final Lcom/kubi/flutter/widget/kline/p;
.super Ljava/lang/Object;
.source "KLineTypeCdnExtension.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0004\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0082\u0008\u001a\u0012\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0012\u0010\u0007\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u0006\u001a\u0012\u0010\t\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u0006\u00a8\u0006\n"
    }
    d2 = {
        "cdnSectionTime",
        "",
        "Lcom/kubi/flutter/widget/kline/KLineType;",
        "getCdnRange",
        "Lcom/kubi/flutter/widget/kline/KLineCdnRange;",
        "currentTime",
        "",
        "getCdnCandleCount",
        "time",
        "getCdnPreviousTime",
        "LKLineWidget_googleRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nKLineTypeCdnExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineTypeCdnExtension.kt\ncom/kubi/flutter/widget/kline/KLineTypeCdnExtensionKt\n*L\n1#1,48:1\n6#1:49\n6#1:50\n6#1:51\n*S KotlinDebug\n*F\n+ 1 KLineTypeCdnExtension.kt\ncom/kubi/flutter/widget/kline/KLineTypeCdnExtensionKt\n*L\n21#1:49\n35#1:50\n47#1:51\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Lcom/kubi/flutter/widget/kline/KLineType;J)J
    .locals 2
    .param p0    # Lcom/kubi/flutter/widget/kline/KLineType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/flutter/widget/kline/KLineType;->q()I

    .line 9
    move-result v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/kubi/flutter/widget/kline/KLineType;->p()I

    .line 13
    move-result v1

    .line 14
    mul-int/2addr v0, v1

    .line 15
    int-to-long v0, v0

    .line 16
    rem-long/2addr p1, v0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/kubi/flutter/widget/kline/KLineType;->q()I

    .line 20
    move-result p0

    .line 21
    int-to-long v0, p0

    .line 22
    div-long/2addr p1, v0

    .line 23
    return-wide p1
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

.method public static final b(Lcom/kubi/flutter/widget/kline/KLineType;J)J
    .locals 2
    .param p0    # Lcom/kubi/flutter/widget/kline/KLineType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/flutter/widget/kline/KLineType;->q()I

    .line 9
    move-result v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/kubi/flutter/widget/kline/KLineType;->p()I

    .line 13
    move-result p0

    .line 14
    mul-int/2addr v0, p0

    .line 15
    int-to-long v0, v0

    .line 16
    sub-long/2addr p1, v0

    .line 17
    return-wide p1
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

.method public static final c(Lcom/kubi/flutter/widget/kline/KLineType;J)Lcom/kubi/flutter/widget/kline/d;
    .locals 4
    .param p0    # Lcom/kubi/flutter/widget/kline/KLineType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/flutter/widget/kline/KLineType;->q()I

    .line 9
    move-result v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/kubi/flutter/widget/kline/KLineType;->p()I

    .line 13
    move-result p0

    .line 14
    mul-int/2addr v0, p0

    .line 15
    int-to-long v0, v0

    .line 16
    .line 17
    rem-long v2, p1, v0

    .line 18
    sub-long/2addr p1, v2

    .line 19
    add-long/2addr v0, p1

    .line 20
    .line 21
    new-instance p0, Lcom/kubi/flutter/widget/kline/d;

    .line 22
    .line 23
    .line 24
    invoke-direct {p0, p1, p2, v0, v1}, Lcom/kubi/flutter/widget/kline/d;-><init>(JJ)V

    .line 25
    return-object p0
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
