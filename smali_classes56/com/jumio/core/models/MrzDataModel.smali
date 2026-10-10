.class public final Lcom/jumio/core/models/MrzDataModel;
.super Lcom/jumio/core/models/DocumentDataModel;
.source "SourceFile"


# annotations
.annotation runtime Lcom/jumio/commons/PersistWith;
    value = "MrzDataModel"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014J\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/jumio/core/models/MrzDataModel;",
        "Lcom/jumio/core/models/DocumentDataModel;",
        "<init>",
        "()V",
        "emrtdStatus",
        "Lcom/jumio/core/enums/EMRTDStatus;",
        "getEmrtdStatus",
        "()Lcom/jumio/core/enums/EMRTDStatus;",
        "setEmrtdStatus",
        "(Lcom/jumio/core/enums/EMRTDStatus;)V",
        "mrtdData",
        "Lcom/jumio/core/models/MrtdDataModel;",
        "mrzData",
        "Lcom/jumio/core/JumioMrzData;",
        "setFromExtractedData",
        "",
        "extractedData",
        "Lcom/jumio/core/models/automation/ExtractedData;",
        "setMrtdData",
        "replaceDocumentData",
        "",
        "fillRequest",
        "request",
        "Lorg/json/JSONObject;",
        "scanPart",
        "Lcom/jumio/core/models/ScanPartModel;",
        "jumio-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMrzDataModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MrzDataModel.kt\ncom/jumio/core/models/MrzDataModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n1#2:118\n*E\n"
    }
.end annotation


# instance fields
.field public q:Lcom/jumio/core/enums/EMRTDStatus;

.field public r:Lcom/jumio/core/models/MrtdDataModel;

.field public final s:Lcom/jumio/core/JumioMrzData;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/jumio/core/models/DocumentDataModel;-><init>()V

    .line 4
    .line 5
    sget-object v0, Lcom/jumio/core/enums/EMRTDStatus;->NOT_PERFORMED:Lcom/jumio/core/enums/EMRTDStatus;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/jumio/core/models/MrzDataModel;->q:Lcom/jumio/core/enums/EMRTDStatus;

    .line 8
    .line 9
    new-instance v0, Lcom/jumio/core/JumioMrzData;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Lcom/jumio/core/JumioMrzData;-><init>()V

    .line 13
    .line 14
    iput-object v0, p0, Lcom/jumio/core/models/MrzDataModel;->s:Lcom/jumio/core/JumioMrzData;

    .line 15
    return-void
    .line 16
.end method

.method public static final a(Lcom/jumio/core/models/MrzDataModel;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lcom/jumio/core/models/DocumentDataModel;->setFirstName(Ljava/lang/String;)V

    .line 9
    .line 10
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 11
    return-object p0
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
.end method

.method public static final b(Lcom/jumio/core/models/MrzDataModel;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lcom/jumio/core/models/DocumentDataModel;->setLastName(Ljava/lang/String;)V

    .line 9
    .line 10
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 11
    return-object p0
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
.end method

.method public static final c(Lcom/jumio/core/models/MrzDataModel;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lcom/jumio/core/models/DocumentDataModel;->setPersonalNumber(Ljava/lang/String;)V

    .line 9
    .line 10
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 11
    return-object p0
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
.end method

.method public static final d(Lcom/jumio/core/models/MrzDataModel;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lcom/jumio/core/models/DocumentDataModel;->setIdNumber(Ljava/lang/String;)V

    .line 9
    .line 10
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 11
    return-object p0
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
.end method

.method public static final e(Lcom/jumio/core/models/MrzDataModel;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lcom/jumio/core/models/DocumentDataModel;->setIssuingCountry(Ljava/lang/String;)V

    .line 9
    .line 10
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 11
    return-object p0
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
.end method

.method public static final f(Lcom/jumio/core/models/MrzDataModel;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lcom/jumio/core/models/DocumentDataModel;->setOriginatingCountry(Ljava/lang/String;)V

    .line 9
    .line 10
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 11
    return-object p0
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
.end method


# virtual methods
.method public fillRequest(Lorg/json/JSONObject;Lcom/jumio/core/models/ScanPartModel;)V
    .locals 6
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/jumio/core/models/ScanPartModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scanPart"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Ljava/text/SimpleDateFormat;

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const-string v2, "yyyy-MM-dd"

    invoke-direct {v0, v2, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 2
    const-string v1, "UTC"

    invoke-static {v1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 3
    invoke-virtual {p0}, Lcom/jumio/core/models/DocumentDataModel;->getFirstName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "firstName"

    invoke-virtual {p0, p1, v2, v1}, Lcom/jumio/core/models/DocumentDataModel;->appendValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0}, Lcom/jumio/core/models/DocumentDataModel;->getLastName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "lastName"

    invoke-virtual {p0, p1, v2, v1}, Lcom/jumio/core/models/DocumentDataModel;->appendValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    invoke-virtual {p0}, Lcom/jumio/core/models/DocumentDataModel;->getPlaceOfBirth()Ljava/lang/String;

    move-result-object v1

    const-string v2, "placeOfBirth"

    invoke-virtual {p0, p1, v2, v1}, Lcom/jumio/core/models/DocumentDataModel;->appendValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    invoke-virtual {p2}, Lcom/jumio/core/models/ScanPartModel;->getCredentialPart()Lcom/jumio/sdk/enums/JumioCredentialPart;

    move-result-object p2

    sget-object v1, Ljumio/core/w2;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v1, p2

    const/4 v1, 0x1

    if-eq p2, v1, :cond_1

    const/4 v1, 0x2

    if-eq p2, v1, :cond_0

    .line 7
    const-string p2, ""

    goto :goto_0

    .line 8
    :cond_0
    const-string p2, "BACK"

    goto :goto_0

    .line 9
    :cond_1
    const-string p2, "FRONT"

    .line 10
    :goto_0
    const-string v1, "extractionSide"

    invoke-virtual {p0, p1, v1, p2}, Lcom/jumio/core/models/DocumentDataModel;->appendValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    invoke-virtual {p0}, Lcom/jumio/core/models/DocumentDataModel;->getIssuingDate()Ljava/util/Date;

    move-result-object p2

    const/4 v1, 0x0

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lcom/jumio/core/models/DocumentDataModel;->getIssuingDate()Ljava/util/Date;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-virtual {v0, p2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p2

    goto :goto_2

    :cond_3
    :goto_1
    move-object p2, v1

    .line 12
    :goto_2
    const-string v0, "issuingDate"

    invoke-virtual {p0, p1, v0, p2}, Lcom/jumio/core/models/DocumentDataModel;->appendValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    iget-object p2, p0, Lcom/jumio/core/models/MrzDataModel;->s:Lcom/jumio/core/JumioMrzData;

    invoke-virtual {p2}, Lcom/jumio/core/JumioMrzData;->getFormat()Ljumio/core/l2;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    const-string v0, "mrzFormat"

    invoke-virtual {p0, p1, v0, p2}, Lcom/jumio/core/models/DocumentDataModel;->appendValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    iget-object p2, p0, Lcom/jumio/core/models/MrzDataModel;->s:Lcom/jumio/core/JumioMrzData;

    invoke-virtual {p2}, Lcom/jumio/core/JumioMrzData;->getMrzLine1()Ljava/lang/String;

    move-result-object p2

    const-string v0, "mrzLine1"

    invoke-virtual {p0, p1, v0, p2}, Lcom/jumio/core/models/DocumentDataModel;->appendValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    iget-object p2, p0, Lcom/jumio/core/models/MrzDataModel;->s:Lcom/jumio/core/JumioMrzData;

    invoke-virtual {p2}, Lcom/jumio/core/JumioMrzData;->getMrzLine2()Ljava/lang/String;

    move-result-object p2

    const-string v0, "mrzLine2"

    invoke-virtual {p0, p1, v0, p2}, Lcom/jumio/core/models/DocumentDataModel;->appendValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    iget-object p2, p0, Lcom/jumio/core/models/MrzDataModel;->s:Lcom/jumio/core/JumioMrzData;

    invoke-virtual {p2}, Lcom/jumio/core/JumioMrzData;->getMrzLine3()Ljava/lang/String;

    move-result-object p2

    const-string v0, "mrzLine3"

    invoke-virtual {p0, p1, v0, p2}, Lcom/jumio/core/models/DocumentDataModel;->appendValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    iget-object p2, p0, Lcom/jumio/core/models/MrzDataModel;->r:Lcom/jumio/core/models/MrtdDataModel;

    if-eqz p2, :cond_11

    iget-object v0, p0, Lcom/jumio/core/models/MrzDataModel;->q:Lcom/jumio/core/enums/EMRTDStatus;

    sget-object v2, Lcom/jumio/core/enums/EMRTDStatus;->SUCCESS:Lcom/jumio/core/enums/EMRTDStatus;

    if-eq v0, v2, :cond_4

    sget-object v2, Lcom/jumio/core/enums/EMRTDStatus;->FAILED:Lcom/jumio/core/enums/EMRTDStatus;

    if-ne v0, v2, :cond_11

    .line 18
    :cond_4
    invoke-interface {p2}, Lcom/jumio/core/models/MrtdDataModel;->getMrzData()Lcom/jumio/core/JumioMrzData;

    move-result-object p2

    if-eqz p2, :cond_8

    .line 19
    iget-object p2, p0, Lcom/jumio/core/models/MrzDataModel;->r:Lcom/jumio/core/models/MrtdDataModel;

    if-eqz p2, :cond_5

    invoke-interface {p2}, Lcom/jumio/core/models/MrtdDataModel;->getMrzData()Lcom/jumio/core/JumioMrzData;

    move-result-object p2

    if-eqz p2, :cond_5

    invoke-virtual {p2}, Lcom/jumio/core/JumioMrzData;->getMrzLine1()Ljava/lang/String;

    move-result-object p2

    goto :goto_3

    :cond_5
    move-object p2, v1

    :goto_3
    const-string v0, "nfcLine1"

    invoke-virtual {p0, p1, v0, p2}, Lcom/jumio/core/models/DocumentDataModel;->appendValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    iget-object p2, p0, Lcom/jumio/core/models/MrzDataModel;->r:Lcom/jumio/core/models/MrtdDataModel;

    if-eqz p2, :cond_6

    invoke-interface {p2}, Lcom/jumio/core/models/MrtdDataModel;->getMrzData()Lcom/jumio/core/JumioMrzData;

    move-result-object p2

    if-eqz p2, :cond_6

    invoke-virtual {p2}, Lcom/jumio/core/JumioMrzData;->getMrzLine2()Ljava/lang/String;

    move-result-object p2

    goto :goto_4

    :cond_6
    move-object p2, v1

    :goto_4
    const-string v0, "nfcLine2"

    invoke-virtual {p0, p1, v0, p2}, Lcom/jumio/core/models/DocumentDataModel;->appendValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    iget-object p2, p0, Lcom/jumio/core/models/MrzDataModel;->r:Lcom/jumio/core/models/MrtdDataModel;

    if-eqz p2, :cond_7

    invoke-interface {p2}, Lcom/jumio/core/models/MrtdDataModel;->getMrzData()Lcom/jumio/core/JumioMrzData;

    move-result-object p2

    if-eqz p2, :cond_7

    invoke-virtual {p2}, Lcom/jumio/core/JumioMrzData;->getMrzLine3()Ljava/lang/String;

    move-result-object p2

    goto :goto_5

    :cond_7
    move-object p2, v1

    :goto_5
    const-string v0, "nfcLine3"

    invoke-virtual {p0, p1, v0, p2}, Lcom/jumio/core/models/DocumentDataModel;->appendValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    :cond_8
    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    .line 23
    iget-object v0, p0, Lcom/jumio/core/models/MrzDataModel;->r:Lcom/jumio/core/models/MrtdDataModel;

    if-eqz v0, :cond_9

    invoke-interface {v0}, Lcom/jumio/core/models/MrtdDataModel;->getBacCheckResult()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_6

    :cond_9
    move-object v0, v1

    :goto_6
    const-string v2, "BAC"

    invoke-virtual {p2, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 24
    iget-object v0, p0, Lcom/jumio/core/models/MrzDataModel;->r:Lcom/jumio/core/models/MrtdDataModel;

    if-eqz v0, :cond_a

    invoke-interface {v0}, Lcom/jumio/core/models/MrtdDataModel;->getActiveAuthResult()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_7

    :cond_a
    move-object v0, v1

    :goto_7
    const-string v2, "AA"

    invoke-virtual {p2, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 25
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 26
    iget-object v2, p0, Lcom/jumio/core/models/MrzDataModel;->r:Lcom/jumio/core/models/MrtdDataModel;

    if-eqz v2, :cond_b

    invoke-interface {v2}, Lcom/jumio/core/models/MrtdDataModel;->getDscCheckResult()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_8

    :cond_b
    move-object v2, v1

    :goto_8
    const-string v3, "DSC"

    invoke-virtual {v0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 27
    iget-object v2, p0, Lcom/jumio/core/models/MrzDataModel;->r:Lcom/jumio/core/models/MrtdDataModel;

    if-eqz v2, :cond_c

    invoke-interface {v2}, Lcom/jumio/core/models/MrtdDataModel;->getRootCertCheck()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_9

    :cond_c
    move-object v2, v1

    :goto_9
    const-string v3, "CSCA"

    invoke-virtual {v0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 28
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 29
    iget-object v3, p0, Lcom/jumio/core/models/MrzDataModel;->r:Lcom/jumio/core/models/MrtdDataModel;

    if-eqz v3, :cond_d

    invoke-interface {v3}, Lcom/jumio/core/models/MrtdDataModel;->getHtCheckResults()Ljava/util/Map;

    move-result-object v3

    goto :goto_a

    :cond_d
    move-object v3, v1

    :goto_a
    if-eqz v3, :cond_f

    .line 30
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_e

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    .line 31
    invoke-virtual {v2, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    goto :goto_b

    .line 32
    :cond_e
    const-string v3, "HTC"

    invoke-virtual {v0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 33
    :cond_f
    const-string v2, "PA"

    invoke-virtual {p2, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 34
    iget-object v0, p0, Lcom/jumio/core/models/MrzDataModel;->r:Lcom/jumio/core/models/MrtdDataModel;

    if-eqz v0, :cond_10

    invoke-interface {v0}, Lcom/jumio/core/models/MrtdDataModel;->getEncodedDataItems()[I

    move-result-object v1

    .line 35
    :cond_10
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 36
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "\""

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p2, 0x22

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v2, "authenticationSteps"

    invoke-virtual {v0, v2, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 37
    invoke-static {v1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object p2

    const-string v1, "toString(...)"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "additionalData"

    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 38
    const-string p2, "eMRTD"

    invoke-virtual {p1, p2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_11
    return-void
.end method

.method public final getEmrtdStatus()Lcom/jumio/core/enums/EMRTDStatus;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/models/MrzDataModel;->q:Lcom/jumio/core/enums/EMRTDStatus;

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
.end method

.method public final setEmrtdStatus(Lcom/jumio/core/enums/EMRTDStatus;)V
    .locals 1
    .param p1    # Lcom/jumio/core/enums/EMRTDStatus;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/jumio/core/models/MrzDataModel;->q:Lcom/jumio/core/enums/EMRTDStatus;

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public final setFromExtractedData(Lcom/jumio/core/models/automation/ExtractedData;)V
    .locals 3
    .param p1    # Lcom/jumio/core/models/automation/ExtractedData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "extractedData"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/jumio/core/models/automation/ExtractedData;->getIssuingCountry()Ljava/lang/String;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/jumio/core/models/DocumentDataModel;->setIssuingCountry(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/jumio/core/models/automation/ExtractedData;->getDateOfBirth()Ljava/util/Date;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lcom/jumio/core/models/DocumentDataModel;->setDob(Ljava/util/Date;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/jumio/core/models/automation/ExtractedData;->getExpiryDate()Ljava/util/Date;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lcom/jumio/core/models/DocumentDataModel;->setExpiryDate(Ljava/util/Date;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/jumio/core/models/automation/ExtractedData;->getDocumentNumber()Ljava/lang/String;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v0}, Lcom/jumio/core/models/DocumentDataModel;->setIdNumber(Ljava/lang/String;)V

    .line 34
    .line 35
    iget-object v0, p0, Lcom/jumio/core/models/MrzDataModel;->s:Lcom/jumio/core/JumioMrzData;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Lcom/jumio/core/models/automation/ExtractedData;->getMrzLine1()Ljava/lang/String;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Lcom/jumio/core/JumioMrzData;->setMrzLine1(Ljava/lang/String;)V

    .line 43
    .line 44
    iget-object v0, p0, Lcom/jumio/core/models/MrzDataModel;->s:Lcom/jumio/core/JumioMrzData;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/jumio/core/models/automation/ExtractedData;->getMrzLine2()Ljava/lang/String;

    .line 48
    move-result-object v1

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1}, Lcom/jumio/core/JumioMrzData;->setMrzLine2(Ljava/lang/String;)V

    .line 52
    .line 53
    iget-object v0, p0, Lcom/jumio/core/models/MrzDataModel;->s:Lcom/jumio/core/JumioMrzData;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Lcom/jumio/core/models/automation/ExtractedData;->getMrzLine3()Ljava/lang/String;

    .line 57
    move-result-object v1

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1}, Lcom/jumio/core/JumioMrzData;->setMrzLine3(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Lcom/jumio/core/models/automation/ExtractedData;->getIdType()Lcom/jumio/sdk/document/JumioDocumentType;

    .line 64
    move-result-object v0

    .line 65
    .line 66
    if-nez v0, :cond_6

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Lcom/jumio/core/models/automation/ExtractedData;->getMrzLine1()Ljava/lang/String;

    .line 70
    move-result-object p1

    .line 71
    .line 72
    .line 73
    invoke-static {p1}, Lkotlin/text/StringsKt;->firstOrNull(Ljava/lang/CharSequence;)Ljava/lang/Character;

    .line 74
    move-result-object p1

    .line 75
    const/4 v0, 0x0

    .line 76
    .line 77
    if-eqz p1, :cond_0

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 81
    move-result p1

    .line 82
    .line 83
    .line 84
    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 85
    move-result-object p1

    .line 86
    .line 87
    const-string v1, "null cannot be cast to non-null type java.lang.String"

    .line 88
    .line 89
    .line 90
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 96
    move-result-object p1

    .line 97
    .line 98
    const-string v1, "toUpperCase(...)"

    .line 99
    .line 100
    .line 101
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    goto :goto_0

    .line 103
    :cond_0
    move-object p1, v0

    .line 104
    .line 105
    :goto_0
    if-eqz p1, :cond_6

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 109
    move-result v1

    .line 110
    .line 111
    const/16 v2, 0x49

    .line 112
    .line 113
    if-eq v1, v2, :cond_5

    .line 114
    .line 115
    const/16 v2, 0x50

    .line 116
    .line 117
    if-eq v1, v2, :cond_3

    .line 118
    .line 119
    const/16 v2, 0x56

    .line 120
    .line 121
    if-eq v1, v2, :cond_1

    .line 122
    goto :goto_1

    .line 123
    .line 124
    :cond_1
    const-string v1, "V"

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 128
    move-result p1

    .line 129
    .line 130
    if-nez p1, :cond_2

    .line 131
    goto :goto_1

    .line 132
    .line 133
    :cond_2
    sget-object v0, Lcom/jumio/sdk/document/JumioDocumentType;->VISA:Lcom/jumio/sdk/document/JumioDocumentType;

    .line 134
    goto :goto_1

    .line 135
    .line 136
    :cond_3
    const-string v1, "P"

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 140
    move-result p1

    .line 141
    .line 142
    if-nez p1, :cond_4

    .line 143
    goto :goto_1

    .line 144
    .line 145
    :cond_4
    sget-object v0, Lcom/jumio/sdk/document/JumioDocumentType;->PASSPORT:Lcom/jumio/sdk/document/JumioDocumentType;

    .line 146
    goto :goto_1

    .line 147
    .line 148
    :cond_5
    const-string v1, "I"

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 152
    move-result p1

    .line 153
    .line 154
    if-eqz p1, :cond_6

    .line 155
    .line 156
    sget-object v0, Lcom/jumio/sdk/document/JumioDocumentType;->ID_CARD:Lcom/jumio/sdk/document/JumioDocumentType;

    .line 157
    .line 158
    .line 159
    :cond_6
    :goto_1
    invoke-virtual {p0, v0}, Lcom/jumio/core/models/DocumentDataModel;->setSelectedDocumentType(Lcom/jumio/sdk/document/JumioDocumentType;)V

    .line 160
    return-void
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
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
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
.end method

.method public final setMrtdData(Lcom/jumio/core/models/MrtdDataModel;Z)V
    .locals 1
    .param p1    # Lcom/jumio/core/models/MrtdDataModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "mrtdData"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/jumio/core/models/MrzDataModel;->r:Lcom/jumio/core/models/MrtdDataModel;

    .line 8
    .line 9
    if-eqz p2, :cond_1

    .line 10
    .line 11
    .line 12
    invoke-interface {p1}, Lcom/jumio/core/models/MrtdDataModel;->getMrzFirstName()Ljava/lang/String;

    .line 13
    move-result-object p2

    .line 14
    .line 15
    new-instance v0, Lr9/d;

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, p0}, Lr9/d;-><init>(Lcom/jumio/core/models/MrzDataModel;)V

    .line 19
    .line 20
    .line 21
    invoke-static {p2, v0}, Lcom/jumio/core/util/StringUtilKt;->isNotNullOrEmpty(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p1}, Lcom/jumio/core/models/MrtdDataModel;->getMrzLastName()Ljava/lang/String;

    .line 25
    move-result-object p2

    .line 26
    .line 27
    new-instance v0, Lr9/e;

    .line 28
    .line 29
    .line 30
    invoke-direct {v0, p0}, Lr9/e;-><init>(Lcom/jumio/core/models/MrzDataModel;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p2, v0}, Lcom/jumio/core/util/StringUtilKt;->isNotNullOrEmpty(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 34
    .line 35
    .line 36
    invoke-interface {p1}, Lcom/jumio/core/models/MrtdDataModel;->getMrzPersonalNumber()Ljava/lang/String;

    .line 37
    move-result-object p2

    .line 38
    .line 39
    new-instance v0, Lr9/f;

    .line 40
    .line 41
    .line 42
    invoke-direct {v0, p0}, Lr9/f;-><init>(Lcom/jumio/core/models/MrzDataModel;)V

    .line 43
    .line 44
    .line 45
    invoke-static {p2, v0}, Lcom/jumio/core/util/StringUtilKt;->isNotNullOrEmpty(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {p1}, Lcom/jumio/core/models/MrtdDataModel;->getMrzIdNumber()Ljava/lang/String;

    .line 49
    move-result-object p2

    .line 50
    .line 51
    new-instance v0, Lr9/g;

    .line 52
    .line 53
    .line 54
    invoke-direct {v0, p0}, Lr9/g;-><init>(Lcom/jumio/core/models/MrzDataModel;)V

    .line 55
    .line 56
    .line 57
    invoke-static {p2, v0}, Lcom/jumio/core/util/StringUtilKt;->isNotNullOrEmpty(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 58
    .line 59
    .line 60
    invoke-interface {p1}, Lcom/jumio/core/models/MrtdDataModel;->getMrzIssuingCountry()Ljava/lang/String;

    .line 61
    move-result-object p2

    .line 62
    .line 63
    new-instance v0, Lr9/h;

    .line 64
    .line 65
    .line 66
    invoke-direct {v0, p0}, Lr9/h;-><init>(Lcom/jumio/core/models/MrzDataModel;)V

    .line 67
    .line 68
    .line 69
    invoke-static {p2, v0}, Lcom/jumio/core/util/StringUtilKt;->isNotNullOrEmpty(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 70
    .line 71
    .line 72
    invoke-interface {p1}, Lcom/jumio/core/models/MrtdDataModel;->getIssuingDate()Ljava/util/Date;

    .line 73
    move-result-object p2

    .line 74
    .line 75
    if-eqz p2, :cond_0

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, p2}, Lcom/jumio/core/models/DocumentDataModel;->setIssuingDate(Ljava/util/Date;)V

    .line 79
    .line 80
    .line 81
    :cond_0
    invoke-interface {p1}, Lcom/jumio/core/models/MrtdDataModel;->getMrzOriginatingCountry()Ljava/lang/String;

    .line 82
    move-result-object p1

    .line 83
    .line 84
    new-instance p2, Lr9/i;

    .line 85
    .line 86
    .line 87
    invoke-direct {p2, p0}, Lr9/i;-><init>(Lcom/jumio/core/models/MrzDataModel;)V

    .line 88
    .line 89
    .line 90
    invoke-static {p1, p2}, Lcom/jumio/core/util/StringUtilKt;->isNotNullOrEmpty(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 91
    :cond_1
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
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
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
.end method
