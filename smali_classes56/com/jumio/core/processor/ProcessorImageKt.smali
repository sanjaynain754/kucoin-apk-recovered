.class public final Lcom/jumio/core/processor/ProcessorImageKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u00a8\u0006\u0005"
    }
    d2 = {
        "asFlashImage",
        "Lcom/jumio/core/processor/ProcessorImage$FlashImage;",
        "Lcom/jumio/core/models/SupplementalImage;",
        "asTiltedImage",
        "Lcom/jumio/core/processor/ProcessorImage$TiltedImage;",
        "jumio-core_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final asFlashImage(Lcom/jumio/core/models/SupplementalImage;)Lcom/jumio/core/processor/ProcessorImage$FlashImage;
    .locals 7
    .param p0    # Lcom/jumio/core/models/SupplementalImage;
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
    new-instance v1, Lcom/jumio/core/processor/ProcessorImage$FlashImage;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/jumio/core/models/SupplementalImage;->getClassifier()Ljava/lang/String;

    .line 11
    move-result-object v2

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/jumio/core/models/SupplementalImage;->getHoldStillTime()J

    .line 15
    move-result-wide v3

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/jumio/core/models/SupplementalImage;->getUsabilityExpected()Z

    .line 19
    move-result v5

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/jumio/core/models/SupplementalImage;->getFlashSettings()Lcom/jumio/core/models/FlashSettings;

    .line 23
    move-result-object v6

    .line 24
    .line 25
    .line 26
    invoke-direct/range {v1 .. v6}, Lcom/jumio/core/processor/ProcessorImage$FlashImage;-><init>(Ljava/lang/String;JZLcom/jumio/core/models/FlashSettings;)V

    .line 27
    return-object v1
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
.end method

.method public static final asTiltedImage(Lcom/jumio/core/models/SupplementalImage;)Lcom/jumio/core/processor/ProcessorImage$TiltedImage;
    .locals 8
    .param p0    # Lcom/jumio/core/models/SupplementalImage;
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
    new-instance v1, Lcom/jumio/core/processor/ProcessorImage$TiltedImage;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/jumio/core/models/SupplementalImage;->getClassifier()Ljava/lang/String;

    .line 11
    move-result-object v2

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/jumio/core/models/SupplementalImage;->getFlash()Z

    .line 15
    move-result v3

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/jumio/core/models/SupplementalImage;->getTiltRange()Lcom/jumio/core/models/TiltRange;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    new-instance v0, Lcom/jumio/core/models/TiltRange;

    .line 24
    const/4 v4, 0x0

    .line 25
    .line 26
    .line 27
    invoke-direct {v0, v4, v4}, Lcom/jumio/core/models/TiltRange;-><init>(II)V

    .line 28
    :cond_0
    move-object v4, v0

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/jumio/core/models/SupplementalImage;->getHoldStillTime()J

    .line 32
    move-result-wide v5

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/jumio/core/models/SupplementalImage;->getUsabilityExpected()Z

    .line 36
    move-result v7

    .line 37
    .line 38
    .line 39
    invoke-direct/range {v1 .. v7}, Lcom/jumio/core/processor/ProcessorImage$TiltedImage;-><init>(Ljava/lang/String;ZLcom/jumio/core/models/TiltRange;JZ)V

    .line 40
    return-object v1
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
.end method
