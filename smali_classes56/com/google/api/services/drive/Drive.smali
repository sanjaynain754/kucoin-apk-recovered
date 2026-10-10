.class public Lcom/google/api/services/drive/Drive;
.super Lcom/google/api/client/googleapis/services/json/AbstractGoogleJsonClient;
.source "Drive.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/api/services/drive/Drive$Builder;,
        Lcom/google/api/services/drive/Drive$Teamdrives;,
        Lcom/google/api/services/drive/Drive$Revisions;,
        Lcom/google/api/services/drive/Drive$Replies;,
        Lcom/google/api/services/drive/Drive$Permissions;,
        Lcom/google/api/services/drive/Drive$Files;,
        Lcom/google/api/services/drive/Drive$Drives;,
        Lcom/google/api/services/drive/Drive$Comments;,
        Lcom/google/api/services/drive/Drive$Channels;,
        Lcom/google/api/services/drive/Drive$Changes;,
        Lcom/google/api/services/drive/Drive$About;
    }
.end annotation


# static fields
.field public static final DEFAULT_BASE_URL:Ljava/lang/String; = "https://www.googleapis.com/drive/v3/"

.field public static final DEFAULT_BATCH_PATH:Ljava/lang/String; = "batch/drive/v3"

.field public static final DEFAULT_MTLS_ROOT_URL:Ljava/lang/String; = "https://www.mtls.googleapis.com/"

.field public static final DEFAULT_ROOT_URL:Ljava/lang/String; = "https://www.googleapis.com/"

.field public static final DEFAULT_SERVICE_PATH:Ljava/lang/String; = "drive/v3/"


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    sget-object v0, Lcom/google/api/client/googleapis/GoogleUtils;->MAJOR_VERSION:Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x1

    .line 8
    .line 9
    if-ne v1, v2, :cond_0

    .line 10
    .line 11
    sget-object v1, Lcom/google/api/client/googleapis/GoogleUtils;->MINOR_VERSION:Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 15
    move-result v3

    .line 16
    .line 17
    const/16 v4, 0x20

    .line 18
    .line 19
    if-ge v3, v4, :cond_2

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 23
    move-result v1

    .line 24
    .line 25
    const/16 v3, 0x1f

    .line 26
    .line 27
    if-ne v1, v3, :cond_0

    .line 28
    .line 29
    sget-object v1, Lcom/google/api/client/googleapis/GoogleUtils;->BUGFIX_VERSION:Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 33
    move-result v1

    .line 34
    .line 35
    if-ge v1, v2, :cond_2

    .line 36
    .line 37
    .line 38
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 39
    move-result v0

    .line 40
    const/4 v1, 0x2

    .line 41
    .line 42
    if-lt v0, v1, :cond_1

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/4 v2, 0x0

    .line 45
    .line 46
    :cond_2
    :goto_0
    sget-object v0, Lcom/google/api/client/googleapis/GoogleUtils;->VERSION:Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    const-string v1, "You are currently running with version %s of google-api-client. You need at least version 1.31.1 of google-api-client to run version 2.0.0 of the Drive API library."

    .line 53
    .line 54
    .line 55
    invoke-static {v2, v1, v0}, Lcom/google/api/client/util/Preconditions;->checkState(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 56
    return-void
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

.method public constructor <init>(Lcom/google/api/client/http/HttpTransport;Lcom/google/api/client/json/JsonFactory;Lcom/google/api/client/http/HttpRequestInitializer;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/api/services/drive/Drive$Builder;

    invoke-direct {v0, p1, p2, p3}, Lcom/google/api/services/drive/Drive$Builder;-><init>(Lcom/google/api/client/http/HttpTransport;Lcom/google/api/client/json/JsonFactory;Lcom/google/api/client/http/HttpRequestInitializer;)V

    invoke-direct {p0, v0}, Lcom/google/api/services/drive/Drive;-><init>(Lcom/google/api/services/drive/Drive$Builder;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/api/services/drive/Drive$Builder;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/google/api/client/googleapis/services/json/AbstractGoogleJsonClient;-><init>(Lcom/google/api/client/googleapis/services/json/AbstractGoogleJsonClient$Builder;)V

    return-void
.end method


# virtual methods
.method public about()Lcom/google/api/services/drive/Drive$About;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/api/services/drive/Drive$About;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/google/api/services/drive/Drive$About;-><init>(Lcom/google/api/services/drive/Drive;)V

    .line 6
    return-object v0
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

.method public changes()Lcom/google/api/services/drive/Drive$Changes;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/api/services/drive/Drive$Changes;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/google/api/services/drive/Drive$Changes;-><init>(Lcom/google/api/services/drive/Drive;)V

    .line 6
    return-object v0
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

.method public channels()Lcom/google/api/services/drive/Drive$Channels;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/api/services/drive/Drive$Channels;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/google/api/services/drive/Drive$Channels;-><init>(Lcom/google/api/services/drive/Drive;)V

    .line 6
    return-object v0
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

.method public comments()Lcom/google/api/services/drive/Drive$Comments;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/api/services/drive/Drive$Comments;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/google/api/services/drive/Drive$Comments;-><init>(Lcom/google/api/services/drive/Drive;)V

    .line 6
    return-object v0
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

.method public drives()Lcom/google/api/services/drive/Drive$Drives;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/api/services/drive/Drive$Drives;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/google/api/services/drive/Drive$Drives;-><init>(Lcom/google/api/services/drive/Drive;)V

    .line 6
    return-object v0
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

.method public files()Lcom/google/api/services/drive/Drive$Files;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/api/services/drive/Drive$Files;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/google/api/services/drive/Drive$Files;-><init>(Lcom/google/api/services/drive/Drive;)V

    .line 6
    return-object v0
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

.method public initialize(Lcom/google/api/client/googleapis/services/AbstractGoogleClientRequest;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/api/client/googleapis/services/AbstractGoogleClientRequest<",
            "*>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/google/api/client/googleapis/services/AbstractGoogleClient;->initialize(Lcom/google/api/client/googleapis/services/AbstractGoogleClientRequest;)V

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public permissions()Lcom/google/api/services/drive/Drive$Permissions;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/api/services/drive/Drive$Permissions;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/google/api/services/drive/Drive$Permissions;-><init>(Lcom/google/api/services/drive/Drive;)V

    .line 6
    return-object v0
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

.method public replies()Lcom/google/api/services/drive/Drive$Replies;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/api/services/drive/Drive$Replies;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/google/api/services/drive/Drive$Replies;-><init>(Lcom/google/api/services/drive/Drive;)V

    .line 6
    return-object v0
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

.method public revisions()Lcom/google/api/services/drive/Drive$Revisions;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/api/services/drive/Drive$Revisions;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/google/api/services/drive/Drive$Revisions;-><init>(Lcom/google/api/services/drive/Drive;)V

    .line 6
    return-object v0
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

.method public teamdrives()Lcom/google/api/services/drive/Drive$Teamdrives;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/api/services/drive/Drive$Teamdrives;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/google/api/services/drive/Drive$Teamdrives;-><init>(Lcom/google/api/services/drive/Drive;)V

    .line 6
    return-object v0
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
