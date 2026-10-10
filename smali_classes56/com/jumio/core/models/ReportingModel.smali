.class public final Lcom/jumio/core/models/ReportingModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jumio/core/model/StaticModel;


# annotations
.annotation runtime Lcom/jumio/commons/PersistWith;
    value = "ReportingModel"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001:\u0002+,B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\nJ\u000e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0006J\u000e\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0006J\u0016\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\rJ\u0016\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\rJ\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%J\u0010\u0010&\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020#H\u0002J*\u0010\'\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u00062\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010(\u001a\u0004\u0018\u00010\u000fH\u0002J\u0012\u0010)\u001a\u00020\u00062\u0008\u0010\u001e\u001a\u0004\u0018\u00010\rH\u0002J\u0012\u0010*\u001a\u00020\u00062\u0008\u0010(\u001a\u0004\u0018\u00010\u000fH\u0002R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0008\u0012\u00060\u0007R\u00020\u00000\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000c\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"
    }
    d2 = {
        "Lcom/jumio/core/models/ReportingModel;",
        "Lcom/jumio/core/model/StaticModel;",
        "<init>",
        "()V",
        "timeMap",
        "Ljava/util/TreeMap;",
        "",
        "Lcom/jumio/core/models/ReportingModel$CredentialTime;",
        "usedModulesList",
        "Lcom/jumio/core/util/ConcurrentMutableList;",
        "Lcom/jumio/core/plugins/PluginModule;",
        "lastCredentialId",
        "lastCredentialPart",
        "Lcom/jumio/sdk/enums/JumioCredentialPart;",
        "lastScanStep",
        "Lcom/jumio/sdk/enums/JumioScanStep;",
        "getLastScanStep",
        "()Lcom/jumio/sdk/enums/JumioScanStep;",
        "setLastScanStep",
        "(Lcom/jumio/sdk/enums/JumioScanStep;)V",
        "startTimestamp",
        "",
        "start",
        "",
        "addUsedModule",
        "pluginModule",
        "startCredential",
        "id",
        "endCredential",
        "startScanPart",
        "credentialPart",
        "endScanPart",
        "getData",
        "Lcom/jumio/analytics/MetaInfo;",
        "credentialsModel",
        "Lcom/jumio/core/models/CredentialsModel;",
        "canceled",
        "",
        "constructDropOffData",
        "setDropOffData",
        "scanStep",
        "getCredentialPartOrder",
        "getScanStepOrder",
        "CredentialTime",
        "TimeSpan",
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
        "SMAP\nReportingModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportingModel.kt\ncom/jumio/core/models/ReportingModel\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,242:1\n381#2,7:243\n381#2,7:250\n216#3,2:257\n1557#4:259\n1628#4,3:260\n360#4,7:264\n774#4:271\n865#4,2:272\n1#5:263\n*S KotlinDebug\n*F\n+ 1 ReportingModel.kt\ncom/jumio/core/models/ReportingModel\n*L\n56#1:243,7\n65#1:250,7\n80#1:257,2\n86#1:259\n86#1:260,3\n106#1:264,7\n113#1:271\n113#1:272,2\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Ljava/util/TreeMap;

.field public final b:Lcom/jumio/core/util/ConcurrentMutableList;

.field public c:Ljava/lang/String;

.field public d:Lcom/jumio/sdk/enums/JumioCredentialPart;

.field public e:Lcom/jumio/sdk/enums/JumioScanStep;

.field public f:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/TreeMap;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/jumio/core/models/ReportingModel;->a:Ljava/util/TreeMap;

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lcom/jumio/core/util/ConcurrentMutableListKt;->concurrentMutableListOf()Lcom/jumio/core/util/ConcurrentMutableList;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    iput-object v0, p0, Lcom/jumio/core/models/ReportingModel;->b:Lcom/jumio/core/util/ConcurrentMutableList;

    .line 17
    .line 18
    const-string v0, ""

    .line 19
    .line 20
    iput-object v0, p0, Lcom/jumio/core/models/ReportingModel;->c:Ljava/lang/String;

    .line 21
    return-void
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
.end method


# virtual methods
.method public final a(Lcom/jumio/core/models/CredentialsModel;Z)Lcom/jumio/analytics/MetaInfo;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "credentialsModel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    new-instance v2, Lcom/jumio/analytics/MetaInfo;

    invoke-direct {v2}, Lcom/jumio/analytics/MetaInfo;-><init>()V

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz p2, :cond_e

    .line 8
    invoke-virtual {v1}, Lcom/jumio/core/models/CredentialsModel;->a()Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lcom/jumio/sdk/credentials/JumioCredentialInfo;

    invoke-virtual {v8}, Lcom/jumio/sdk/credentials/JumioCredentialInfo;->getId()Ljava/lang/String;

    move-result-object v8

    iget-object v9, v0, Lcom/jumio/core/models/ReportingModel;->c:Ljava/lang/String;

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    goto :goto_0

    :cond_1
    move-object v7, v5

    :goto_0
    check-cast v7, Lcom/jumio/sdk/credentials/JumioCredentialInfo;

    if-eqz v7, :cond_4

    .line 9
    invoke-virtual {v7}, Lcom/jumio/sdk/credentials/JumioCredentialInfo;->getCategory()Lcom/jumio/sdk/credentials/JumioCredentialCategory;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    .line 10
    sget-object v8, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    .line 11
    sget-object v8, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 12
    invoke-virtual {v1}, Lcom/jumio/core/models/CredentialsModel;->a()Ljava/util/ArrayList;

    move-result-object v9

    .line 13
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    const/4 v10, 0x0

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_3

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .line 14
    check-cast v11, Lcom/jumio/sdk/credentials/JumioCredentialInfo;

    .line 15
    invoke-virtual {v11}, Lcom/jumio/sdk/credentials/JumioCredentialInfo;->getId()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v7}, Lcom/jumio/sdk/credentials/JumioCredentialInfo;->getId()Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_2

    goto :goto_2

    :cond_2
    add-int/2addr v10, v4

    goto :goto_1

    :cond_3
    const/4 v10, -0x1

    :goto_2
    add-int/2addr v10, v4

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    .line 16
    invoke-static {v7, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v7

    const-string v9, "%02d"

    invoke-static {v8, v9, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "format(...)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_3

    .line 17
    :cond_4
    const-string v6, ""

    move-object v7, v6

    .line 18
    :goto_3
    iget-object v8, v0, Lcom/jumio/core/models/ReportingModel;->d:Lcom/jumio/sdk/enums/JumioCredentialPart;

    const-string v9, " | "

    if-eqz v8, :cond_5

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 19
    :cond_5
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, v0, Lcom/jumio/core/models/ReportingModel;->d:Lcom/jumio/sdk/enums/JumioCredentialPart;

    if-nez v7, :cond_6

    const/4 v7, -0x1

    goto :goto_4

    .line 20
    :cond_6
    sget-object v10, Ljumio/core/n3;->a:[I

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v7, v10, v7

    :goto_4
    const-string v10, "00"

    const-string v11, "70"

    packed-switch v7, :pswitch_data_0

    :pswitch_0
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :pswitch_1
    move-object v7, v11

    goto :goto_5

    .line 21
    :pswitch_2
    const-string v7, "60"

    goto :goto_5

    .line 22
    :pswitch_3
    const-string v7, "40"

    goto :goto_5

    .line 23
    :pswitch_4
    const-string v7, "30"

    goto :goto_5

    .line 24
    :pswitch_5
    const-string v7, "0"

    goto :goto_5

    .line 25
    :pswitch_6
    const-string v7, "20"

    goto :goto_5

    .line 26
    :pswitch_7
    const-string v7, "10"

    goto :goto_5

    :pswitch_8
    move-object v7, v10

    .line 27
    :goto_5
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 28
    iget-object v8, v0, Lcom/jumio/core/models/ReportingModel;->e:Lcom/jumio/sdk/enums/JumioScanStep;

    if-eqz v8, :cond_7

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 29
    :cond_7
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, v0, Lcom/jumio/core/models/ReportingModel;->e:Lcom/jumio/sdk/enums/JumioScanStep;

    if-nez v7, :cond_8

    const/4 v7, -0x1

    goto :goto_6

    .line 30
    :cond_8
    sget-object v9, Ljumio/core/n3;->b:[I

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v7, v9, v7

    :goto_6
    packed-switch v7, :pswitch_data_1

    :pswitch_9
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    .line 31
    :pswitch_a
    const-string v10, "91"

    goto :goto_7

    .line 32
    :pswitch_b
    const-string v10, "84"

    goto :goto_7

    .line 33
    :pswitch_c
    const-string v10, "77"

    goto :goto_7

    :pswitch_d
    move-object v10, v11

    goto :goto_7

    .line 34
    :pswitch_e
    const-string v10, "63"

    goto :goto_7

    .line 35
    :pswitch_f
    const-string v10, "56"

    goto :goto_7

    .line 36
    :pswitch_10
    const-string v10, "49"

    goto :goto_7

    .line 37
    :pswitch_11
    const-string v10, "42"

    goto :goto_7

    .line 38
    :pswitch_12
    const-string v10, "38"

    goto :goto_7

    .line 39
    :pswitch_13
    const-string v10, "35"

    goto :goto_7

    .line 40
    :pswitch_14
    const-string v10, "32"

    goto :goto_7

    .line 41
    :pswitch_15
    const-string v10, "28"

    goto :goto_7

    .line 42
    :pswitch_16
    const-string v10, "21"

    goto :goto_7

    .line 43
    :pswitch_17
    const-string v10, "14"

    goto :goto_7

    .line 44
    :pswitch_18
    const-string v10, "07"

    .line 45
    :goto_7
    :pswitch_19
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 46
    iget-object v8, v1, Lcom/jumio/core/models/CredentialsModel;->a:Ljava/util/List;

    .line 47
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 48
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_9
    :goto_8
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_a

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object v11, v10

    check-cast v11, Lcom/jumio/core/models/CredentialDataModel;

    .line 49
    invoke-virtual {v11}, Lcom/jumio/core/models/CredentialDataModel;->a()Z

    move-result v11

    if-nez v11, :cond_9

    .line 50
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 51
    :cond_a
    invoke-virtual {v1}, Lcom/jumio/core/models/CredentialsModel;->a()Ljava/util/ArrayList;

    move-result-object v8

    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v8

    const-string v10, "000000"

    const-string v11, "SDK INIT"

    if-eqz v8, :cond_b

    :goto_9
    move-object v7, v10

    move-object v6, v11

    goto :goto_a

    .line 52
    :cond_b
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_c

    .line 53
    const-string v6, "SUBMISSION"

    const-string v7, "990000"

    goto :goto_a

    .line 54
    :cond_c
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_d

    goto :goto_9

    .line 55
    :cond_d
    :goto_a
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v7, 0x20

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 56
    const-string v7, "dropOffInfo"

    invoke-virtual {v2, v7, v6}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    :cond_e
    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 58
    iget-object v7, v0, Lcom/jumio/core/models/ReportingModel;->a:Ljava/util/TreeMap;

    .line 59
    invoke-virtual {v7}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_b
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    const/16 v9, 0x3e8

    const-string v10, "total"

    if-eqz v8, :cond_10

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map$Entry;

    .line 60
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v11

    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljumio/core/l3;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    new-instance v12, Ljava/util/LinkedHashMap;

    invoke-direct {v12}, Ljava/util/LinkedHashMap;-><init>()V

    .line 62
    iget-object v13, v8, Ljumio/core/l3;->a:Ljumio/core/m3;

    .line 63
    iget-wide v13, v13, Ljumio/core/m3;->b:J

    int-to-long v3, v9

    div-long/2addr v13, v3

    long-to-int v9, v13

    .line 64
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v12, v10, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    iget-object v8, v8, Ljumio/core/l3;->b:Ljava/util/HashMap;

    .line 66
    invoke-virtual {v8}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_c
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_f

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Map$Entry;

    .line 67
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/jumio/sdk/enums/JumioCredentialPart;

    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljumio/core/m3;

    .line 68
    iget-wide v13, v9, Ljumio/core/m3;->b:J

    .line 69
    div-long/2addr v13, v3

    long-to-int v9, v13

    .line 70
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v12, v10, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_c

    .line 71
    :cond_f
    invoke-interface {v6, v11, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v4, 0x1

    goto :goto_b

    .line 72
    :cond_10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-wide v7, v0, Lcom/jumio/core/models/ReportingModel;->f:J

    sub-long/2addr v3, v7

    int-to-long v7, v9

    div-long/2addr v3, v7

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v6, v10, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    const-string v3, "sec"

    invoke-virtual {v2, v3, v6}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    iget-object v3, v0, Lcom/jumio/core/models/ReportingModel;->b:Lcom/jumio/core/util/ConcurrentMutableList;

    .line 75
    new-instance v4, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v3, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 76
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 77
    check-cast v6, Ljumio/core/W2;

    .line 78
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    .line 79
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_d

    .line 80
    :cond_11
    const-string v3, "usedModules"

    invoke-virtual {v2, v3, v4}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    iget-object v3, v1, Lcom/jumio/core/models/CredentialsModel;->a:Ljava/util/List;

    .line 82
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_12
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_13

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Lcom/jumio/core/models/CredentialDataModel;

    .line 83
    iget-object v6, v6, Lcom/jumio/core/models/CredentialDataModel;->b:Lcom/jumio/sdk/credentials/JumioCredentialCategory;

    .line 84
    sget-object v7, Lcom/jumio/sdk/credentials/JumioCredentialCategory;->FACE:Lcom/jumio/sdk/credentials/JumioCredentialCategory;

    if-ne v6, v7, :cond_12

    goto :goto_e

    :cond_13
    move-object v4, v5

    .line 85
    :goto_e
    check-cast v4, Lcom/jumio/core/models/CredentialDataModel;

    const/4 v3, 0x2

    if-nez v4, :cond_14

    goto :goto_f

    .line 86
    :cond_14
    iget-object v4, v4, Lcom/jumio/core/models/CredentialDataModel;->e:Ljava/util/SortedMap;

    .line 87
    sget-object v6, Lcom/jumio/sdk/enums/JumioCredentialPart;->FACE:Lcom/jumio/sdk/enums/JumioCredentialPart;

    invoke-interface {v4, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/jumio/core/models/ScanPartModel;

    if-nez v4, :cond_15

    goto :goto_f

    .line 88
    :cond_15
    invoke-virtual {v4}, Lcom/jumio/core/models/ScanPartModel;->getMode()Lcom/jumio/core/data/ScanMode;

    move-result-object v4

    sget-object v6, Ljumio/core/o3;->a:[I

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v4, v6, v4

    const/4 v6, 0x1

    if-eq v4, v6, :cond_18

    if-eq v4, v3, :cond_17

    const/4 v6, 0x3

    if-eq v4, v6, :cond_16

    :goto_f
    move-object v4, v5

    goto :goto_10

    .line 89
    :cond_16
    const-string v4, "JUMIO_STANDARD"

    goto :goto_10

    .line 90
    :cond_17
    const-string v4, "JUMIO_LIVENESS"

    goto :goto_10

    .line 91
    :cond_18
    const-string v4, "JUMIO_PREMIUM"

    :goto_10
    if-eqz v4, :cond_19

    .line 92
    const-string v6, "livenessCaptureType"

    invoke-virtual {v2, v6, v4}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    :cond_19
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 94
    iget-object v1, v1, Lcom/jumio/core/models/CredentialsModel;->a:Ljava/util/List;

    .line 95
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 96
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1a
    :goto_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lcom/jumio/core/models/CredentialDataModel;

    .line 97
    iget-object v8, v8, Lcom/jumio/core/models/CredentialDataModel;->b:Lcom/jumio/sdk/credentials/JumioCredentialCategory;

    .line 98
    sget-object v9, Lcom/jumio/sdk/credentials/JumioCredentialCategory;->ID:Lcom/jumio/sdk/credentials/JumioCredentialCategory;

    if-ne v8, v9, :cond_1a

    .line 99
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_11

    .line 100
    :cond_1b
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_12
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_23

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/jumio/core/models/CredentialDataModel;

    .line 101
    iget-object v7, v6, Lcom/jumio/core/models/CredentialDataModel;->e:Ljava/util/SortedMap;

    .line 102
    invoke-interface {v7}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_1c
    :goto_13
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_22

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map$Entry;

    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/jumio/sdk/enums/JumioCredentialPart;

    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/jumio/core/models/ScanPartModel;

    .line 103
    instance-of v9, v8, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    if-eqz v9, :cond_1d

    check-cast v8, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    goto :goto_14

    :cond_1d
    move-object v8, v5

    :goto_14
    if-nez v8, :cond_1e

    goto :goto_13

    .line 104
    :cond_1e
    invoke-virtual {v8}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->getDocumentData()Lcom/jumio/core/models/DocumentDataModel;

    move-result-object v9

    instance-of v10, v9, Lcom/jumio/core/models/MrzDataModel;

    if-eqz v10, :cond_1f

    check-cast v9, Lcom/jumio/core/models/MrzDataModel;

    goto :goto_15

    :cond_1f
    move-object v9, v5

    :goto_15
    if-eqz v9, :cond_20

    invoke-virtual {v9}, Lcom/jumio/core/models/MrzDataModel;->getEmrtdStatus()Lcom/jumio/core/enums/EMRTDStatus;

    move-result-object v9

    goto :goto_16

    :cond_20
    move-object v9, v5

    :goto_16
    if-nez v9, :cond_21

    const/4 v10, -0x1

    :goto_17
    const/4 v15, -0x1

    goto :goto_18

    .line 105
    :cond_21
    sget-object v10, Ljumio/core/o3;->b:[I

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aget v10, v10, v11

    goto :goto_17

    :goto_18
    if-eq v10, v15, :cond_1c

    const/4 v11, 0x1

    if-eq v10, v11, :cond_1c

    if-eq v10, v3, :cond_1c

    .line 106
    new-instance v10, Ljava/util/LinkedHashMap;

    invoke-direct {v10}, Ljava/util/LinkedHashMap;-><init>()V

    .line 107
    const-string v12, "id"

    .line 108
    iget-object v13, v6, Lcom/jumio/core/models/CredentialDataModel;->a:Ljava/lang/String;

    .line 109
    invoke-interface {v10, v12, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    invoke-static {v8}, Ljumio/core/A3;->a(Lcom/jumio/core/models/ScanPartModel;)Ljava/lang/String;

    move-result-object v8

    const-string v12, "uploadType"

    invoke-interface {v10, v12, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    const-string v9, "status"

    invoke-interface {v10, v9, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_13

    :cond_22
    const/4 v15, -0x1

    goto/16 :goto_12

    .line 113
    :cond_23
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_24

    move-object v5, v4

    :cond_24
    if-eqz v5, :cond_25

    .line 114
    const-string v1, "emrtdStatus"

    invoke-virtual {v2, v1, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_25
    return-object v2

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_8
        :pswitch_0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch -0x1
        :pswitch_19
        :pswitch_9
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch
.end method

.method public final a(Ljava/lang/String;Lcom/jumio/sdk/enums/JumioCredentialPart;)V
    .locals 8

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "credentialPart"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/jumio/core/models/ReportingModel;->a:Ljava/util/TreeMap;

    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljumio/core/l3;

    if-eqz p1, :cond_1

    .line 2
    iget-object p1, p1, Ljumio/core/l3;->b:Ljava/util/HashMap;

    if-eqz p1, :cond_1

    .line 3
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljumio/core/m3;

    if-eqz p1, :cond_1

    .line 4
    iget-wide v0, p1, Ljumio/core/m3;->a:J

    const-wide/16 v2, 0x0

    cmp-long p2, v0, v2

    if-eqz p2, :cond_0

    .line 5
    iget-wide v0, p1, Ljumio/core/m3;->b:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-wide v6, p1, Ljumio/core/m3;->a:J

    sub-long/2addr v4, v6

    add-long/2addr v4, v0

    iput-wide v4, p1, Ljumio/core/m3;->b:J

    .line 6
    :cond_0
    iput-wide v2, p1, Ljumio/core/m3;->a:J

    :cond_1
    return-void
.end method

.method public final b(Ljava/lang/String;Lcom/jumio/sdk/enums/JumioCredentialPart;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "id"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "credentialPart"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iput-object p1, p0, Lcom/jumio/core/models/ReportingModel;->c:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p2, p0, Lcom/jumio/core/models/ReportingModel;->d:Lcom/jumio/sdk/enums/JumioCredentialPart;

    .line 15
    const/4 v0, 0x0

    .line 16
    .line 17
    iput-object v0, p0, Lcom/jumio/core/models/ReportingModel;->e:Lcom/jumio/sdk/enums/JumioScanStep;

    .line 18
    .line 19
    iget-object v0, p0, Lcom/jumio/core/models/ReportingModel;->a:Ljava/util/TreeMap;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    check-cast p1, Ljumio/core/l3;

    .line 26
    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget-object p1, p1, Ljumio/core/l3;->b:Ljava/util/HashMap;

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    new-instance v0, Ljumio/core/m3;

    .line 40
    .line 41
    .line 42
    invoke-direct {v0}, Ljumio/core/m3;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, p2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    :cond_0
    check-cast v0, Ljumio/core/m3;

    .line 48
    .line 49
    .line 50
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 51
    move-result-wide p1

    .line 52
    .line 53
    iput-wide p1, v0, Ljumio/core/m3;->a:J

    .line 54
    :cond_1
    return-void
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
