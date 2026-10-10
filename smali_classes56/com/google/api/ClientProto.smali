.class public final Lcom/google/api/ClientProto;
.super Ljava/lang/Object;
.source "ClientProto.java"


# static fields
.field public static final DEFAULT_HOST_FIELD_NUMBER:I = 0x419

.field public static final METHOD_SIGNATURE_FIELD_NUMBER:I = 0x41b

.field public static final OAUTH_SCOPES_FIELD_NUMBER:I = 0x41a

.field public static final defaultHost:Lcom/google/protobuf/GeneratedMessageLite$GeneratedExtension;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/GeneratedMessageLite$GeneratedExtension<",
            "Lcom/google/protobuf/DescriptorProtos$ServiceOptions;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final methodSignature:Lcom/google/protobuf/GeneratedMessageLite$GeneratedExtension;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/GeneratedMessageLite$GeneratedExtension<",
            "Lcom/google/protobuf/DescriptorProtos$MethodOptions;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field public static final oauthScopes:Lcom/google/protobuf/GeneratedMessageLite$GeneratedExtension;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/GeneratedMessageLite$GeneratedExtension<",
            "Lcom/google/protobuf/DescriptorProtos$ServiceOptions;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$MethodOptions;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$MethodOptions;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sget-object v6, Lcom/google/protobuf/WireFormat$FieldType;->STRING:Lcom/google/protobuf/WireFormat$FieldType;

    .line 7
    const/4 v5, 0x0

    .line 8
    move-object v4, v6

    .line 9
    .line 10
    const-class v6, Ljava/lang/String;

    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    .line 14
    const/16 v3, 0x41b

    .line 15
    .line 16
    .line 17
    invoke-static/range {v0 .. v6}, Lcom/google/protobuf/GeneratedMessageLite;->newRepeatedGeneratedExtension(Lcom/google/protobuf/MessageLite;Lcom/google/protobuf/MessageLite;Lcom/google/protobuf/Internal$EnumLiteMap;ILcom/google/protobuf/WireFormat$FieldType;ZLjava/lang/Class;)Lcom/google/protobuf/GeneratedMessageLite$GeneratedExtension;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    sput-object v0, Lcom/google/api/ClientProto;->methodSignature:Lcom/google/protobuf/GeneratedMessageLite$GeneratedExtension;

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$ServiceOptions;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$ServiceOptions;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    const/16 v5, 0x419

    .line 27
    .line 28
    const-class v7, Ljava/lang/String;

    .line 29
    .line 30
    const-string v2, ""

    .line 31
    const/4 v3, 0x0

    .line 32
    move-object v6, v4

    .line 33
    const/4 v4, 0x0

    .line 34
    .line 35
    .line 36
    invoke-static/range {v1 .. v7}, Lcom/google/protobuf/GeneratedMessageLite;->newSingularGeneratedExtension(Lcom/google/protobuf/MessageLite;Ljava/lang/Object;Lcom/google/protobuf/MessageLite;Lcom/google/protobuf/Internal$EnumLiteMap;ILcom/google/protobuf/WireFormat$FieldType;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessageLite$GeneratedExtension;

    .line 37
    move-result-object v0

    .line 38
    move-object v4, v6

    .line 39
    .line 40
    sput-object v0, Lcom/google/api/ClientProto;->defaultHost:Lcom/google/protobuf/GeneratedMessageLite$GeneratedExtension;

    .line 41
    .line 42
    .line 43
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$ServiceOptions;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$ServiceOptions;

    .line 44
    move-result-object v1

    .line 45
    .line 46
    const/16 v5, 0x41a

    .line 47
    .line 48
    const-class v7, Ljava/lang/String;

    .line 49
    .line 50
    const-string v2, ""

    .line 51
    const/4 v4, 0x0

    .line 52
    .line 53
    .line 54
    invoke-static/range {v1 .. v7}, Lcom/google/protobuf/GeneratedMessageLite;->newSingularGeneratedExtension(Lcom/google/protobuf/MessageLite;Ljava/lang/Object;Lcom/google/protobuf/MessageLite;Lcom/google/protobuf/Internal$EnumLiteMap;ILcom/google/protobuf/WireFormat$FieldType;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessageLite$GeneratedExtension;

    .line 55
    move-result-object v0

    .line 56
    .line 57
    sput-object v0, Lcom/google/api/ClientProto;->oauthScopes:Lcom/google/protobuf/GeneratedMessageLite$GeneratedExtension;

    .line 58
    return-void
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
.end method

.method public static registerAllExtensions(Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/google/api/ClientProto;->methodSignature:Lcom/google/protobuf/GeneratedMessageLite$GeneratedExtension;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/google/protobuf/ExtensionRegistryLite;->add(Lcom/google/protobuf/GeneratedMessageLite$GeneratedExtension;)V

    .line 6
    .line 7
    sget-object v0, Lcom/google/api/ClientProto;->defaultHost:Lcom/google/protobuf/GeneratedMessageLite$GeneratedExtension;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lcom/google/protobuf/ExtensionRegistryLite;->add(Lcom/google/protobuf/GeneratedMessageLite$GeneratedExtension;)V

    .line 11
    .line 12
    sget-object v0, Lcom/google/api/ClientProto;->oauthScopes:Lcom/google/protobuf/GeneratedMessageLite$GeneratedExtension;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lcom/google/protobuf/ExtensionRegistryLite;->add(Lcom/google/protobuf/GeneratedMessageLite$GeneratedExtension;)V

    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
