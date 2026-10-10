.class public Lcn/jiguang/privates/push/api/NotificationMessage;
.super Ljava/lang/Object;
.source "NotificationMessage.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcn/jiguang/privates/push/api/NotificationMessage;",
            ">;"
        }
    .end annotation
.end field

.field public static final NOTIFICATION_STYLE_BIG_PICTURE:I = 0x3

.field public static final NOTIFICATION_STYLE_BIG_TEXT:I = 0x1

.field public static final NOTIFICATION_STYLE_INBOX:I = 0x2


# instance fields
.field private badge:I

.field private bigPicture:Ljava/lang/String;

.field private bigText:Ljava/lang/String;

.field private builderId:I

.field private category:Ljava/lang/String;

.field private channelId:Ljava/lang/String;

.field private content:Ljava/lang/String;

.field private defaults:I

.field private extras:Landroid/os/Bundle;

.field private inbox:[Ljava/lang/String;

.field private intentUri:Ljava/lang/String;

.field private largeIcon:Ljava/lang/String;

.field private messageId:Ljava/lang/String;

.field private notificationId:I

.field private overrideMessageId:Ljava/lang/String;

.field private platform:B

.field private platformMessageId:Ljava/lang/String;

.field private priority:I

.field private smallIcon:Ljava/lang/String;

.field private sound:Ljava/lang/String;

.field private style:I

.field private title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcn/jiguang/privates/push/api/NotificationMessage$1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcn/jiguang/privates/push/api/NotificationMessage$1;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcn/jiguang/privates/push/api/NotificationMessage;->CREATOR:Landroid/os/Parcelable$Creator;

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
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    const-string v0, ""

    iput-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->messageId:Ljava/lang/String;

    .line 3
    iput-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->overrideMessageId:Ljava/lang/String;

    const/4 v1, 0x0

    .line 4
    iput-byte v1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->platform:B

    .line 5
    iput-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->platformMessageId:Ljava/lang/String;

    .line 6
    iput v1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->notificationId:I

    .line 7
    iput-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->smallIcon:Ljava/lang/String;

    .line 8
    iput-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->largeIcon:Ljava/lang/String;

    .line 9
    iput-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->title:Ljava/lang/String;

    .line 10
    iput-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->content:Ljava/lang/String;

    const/4 v2, 0x0

    .line 11
    iput-object v2, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->extras:Landroid/os/Bundle;

    .line 12
    iput v1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->style:I

    .line 13
    iput-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->bigText:Ljava/lang/String;

    .line 14
    iput-object v2, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->inbox:[Ljava/lang/String;

    .line 15
    iput-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->bigPicture:Ljava/lang/String;

    .line 16
    iput v1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->priority:I

    const/4 v2, -0x1

    .line 17
    iput v2, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->defaults:I

    .line 18
    iput-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->sound:Ljava/lang/String;

    .line 19
    iput-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->channelId:Ljava/lang/String;

    .line 20
    iput-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->intentUri:Ljava/lang/String;

    .line 21
    iput v1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->badge:I

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    const-string v0, ""

    iput-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->messageId:Ljava/lang/String;

    .line 24
    iput-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->overrideMessageId:Ljava/lang/String;

    const/4 v1, 0x0

    .line 25
    iput-byte v1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->platform:B

    .line 26
    iput-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->platformMessageId:Ljava/lang/String;

    .line 27
    iput v1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->notificationId:I

    .line 28
    iput-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->smallIcon:Ljava/lang/String;

    .line 29
    iput-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->largeIcon:Ljava/lang/String;

    .line 30
    iput-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->title:Ljava/lang/String;

    .line 31
    iput-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->content:Ljava/lang/String;

    const/4 v2, 0x0

    .line 32
    iput-object v2, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->extras:Landroid/os/Bundle;

    .line 33
    iput v1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->style:I

    .line 34
    iput-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->bigText:Ljava/lang/String;

    .line 35
    iput-object v2, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->inbox:[Ljava/lang/String;

    .line 36
    iput-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->bigPicture:Ljava/lang/String;

    .line 37
    iput v1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->priority:I

    const/4 v2, -0x1

    .line 38
    iput v2, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->defaults:I

    .line 39
    iput-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->sound:Ljava/lang/String;

    .line 40
    iput-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->channelId:Ljava/lang/String;

    .line 41
    iput-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->intentUri:Ljava/lang/String;

    .line 42
    iput v1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->badge:I

    .line 43
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->messageId:Ljava/lang/String;

    .line 44
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->overrideMessageId:Ljava/lang/String;

    .line 45
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    iput-byte v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->platform:B

    .line 46
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->platformMessageId:Ljava/lang/String;

    .line 47
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->notificationId:I

    .line 48
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->smallIcon:Ljava/lang/String;

    .line 49
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->largeIcon:Ljava/lang/String;

    .line 50
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->title:Ljava/lang/String;

    .line 51
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->content:Ljava/lang/String;

    .line 52
    invoke-virtual {p1}, Landroid/os/Parcel;->readBundle()Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->extras:Landroid/os/Bundle;

    .line 53
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->builderId:I

    .line 54
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->style:I

    .line 55
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->bigText:Ljava/lang/String;

    .line 56
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->inbox:[Ljava/lang/String;

    .line 57
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->bigPicture:Ljava/lang/String;

    .line 58
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->priority:I

    .line 59
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->defaults:I

    .line 60
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->category:Ljava/lang/String;

    .line 61
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->sound:Ljava/lang/String;

    .line 62
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->channelId:Ljava/lang/String;

    .line 63
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->intentUri:Ljava/lang/String;

    .line 64
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->badge:I

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
    .line 3
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
    .line 17
    .line 18
.end method

.method public getBadge()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->badge:I

    .line 3
    return v0
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
    .line 17
    .line 18
.end method

.method public getBigPicture()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->bigPicture:Ljava/lang/String;

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
    .line 17
    .line 18
.end method

.method public getBigText()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->bigText:Ljava/lang/String;

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
    .line 17
    .line 18
.end method

.method public getBuilderId()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->builderId:I

    .line 3
    return v0
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
    .line 17
    .line 18
.end method

.method public getCategory()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->category:Ljava/lang/String;

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
    .line 17
    .line 18
.end method

.method public getChannelId()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->channelId:Ljava/lang/String;

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
    .line 17
    .line 18
.end method

.method public getContent()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->content:Ljava/lang/String;

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
    .line 17
    .line 18
.end method

.method public getDefaults()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->defaults:I

    .line 3
    return v0
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
    .line 17
    .line 18
.end method

.method public getExtras()Landroid/os/Bundle;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->extras:Landroid/os/Bundle;

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
    .line 17
    .line 18
.end method

.method public getInbox()[Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->inbox:[Ljava/lang/String;

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
    .line 17
    .line 18
.end method

.method public getIntentUri()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->intentUri:Ljava/lang/String;

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
    .line 17
    .line 18
.end method

.method public getLargeIcon()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->largeIcon:Ljava/lang/String;

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
    .line 17
    .line 18
.end method

.method public getMessageId()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->messageId:Ljava/lang/String;

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
    .line 17
    .line 18
.end method

.method public getNotificationId()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->notificationId:I

    .line 3
    return v0
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
    .line 17
    .line 18
.end method

.method public getOverrideMessageId()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->overrideMessageId:Ljava/lang/String;

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
    .line 17
    .line 18
.end method

.method public getPlatform()B
    .locals 1

    .line 1
    .line 2
    iget-byte v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->platform:B

    .line 3
    return v0
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
    .line 17
    .line 18
.end method

.method public getPlatformMessageId()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->platformMessageId:Ljava/lang/String;

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
    .line 17
    .line 18
.end method

.method public getPriority()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->priority:I

    .line 3
    return v0
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
    .line 17
    .line 18
.end method

.method public getSmallIcon()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->smallIcon:Ljava/lang/String;

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
    .line 17
    .line 18
.end method

.method public getSound()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->sound:Ljava/lang/String;

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
    .line 17
    .line 18
.end method

.method public getStyle()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->style:I

    .line 3
    return v0
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
    .line 17
    .line 18
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->title:Ljava/lang/String;

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
    .line 17
    .line 18
.end method

.method public setBadge(I)Lcn/jiguang/privates/push/api/NotificationMessage;
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->badge:I

    .line 3
    return-object p0
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public setBigPicture(Ljava/lang/String;)Lcn/jiguang/privates/push/api/NotificationMessage;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->bigPicture:Ljava/lang/String;

    .line 3
    return-object p0
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public setBigText(Ljava/lang/String;)Lcn/jiguang/privates/push/api/NotificationMessage;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->bigText:Ljava/lang/String;

    .line 3
    return-object p0
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public setBuilderId(I)Lcn/jiguang/privates/push/api/NotificationMessage;
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->builderId:I

    .line 3
    return-object p0
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public setCategory(Ljava/lang/String;)Lcn/jiguang/privates/push/api/NotificationMessage;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->category:Ljava/lang/String;

    .line 3
    return-object p0
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public setChannelId(Ljava/lang/String;)Lcn/jiguang/privates/push/api/NotificationMessage;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->channelId:Ljava/lang/String;

    .line 3
    return-object p0
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public setContent(Ljava/lang/String;)Lcn/jiguang/privates/push/api/NotificationMessage;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->content:Ljava/lang/String;

    .line 3
    return-object p0
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public setDefaults(I)Lcn/jiguang/privates/push/api/NotificationMessage;
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->defaults:I

    .line 3
    return-object p0
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public setExtras(Landroid/os/Bundle;)Lcn/jiguang/privates/push/api/NotificationMessage;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->extras:Landroid/os/Bundle;

    .line 3
    return-object p0
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public setInbox([Ljava/lang/String;)Lcn/jiguang/privates/push/api/NotificationMessage;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->inbox:[Ljava/lang/String;

    .line 3
    return-object p0
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public setIntentUri(Ljava/lang/String;)Lcn/jiguang/privates/push/api/NotificationMessage;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->intentUri:Ljava/lang/String;

    .line 3
    return-object p0
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public setLargeIcon(Ljava/lang/String;)Lcn/jiguang/privates/push/api/NotificationMessage;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->largeIcon:Ljava/lang/String;

    .line 3
    return-object p0
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public setMessageId(Ljava/lang/String;)Lcn/jiguang/privates/push/api/NotificationMessage;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->messageId:Ljava/lang/String;

    .line 3
    return-object p0
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public setNotificationId(I)Lcn/jiguang/privates/push/api/NotificationMessage;
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->notificationId:I

    .line 3
    return-object p0
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public setOverrideMessageId(Ljava/lang/String;)Lcn/jiguang/privates/push/api/NotificationMessage;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->overrideMessageId:Ljava/lang/String;

    .line 3
    return-object p0
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public setPlatform(B)Lcn/jiguang/privates/push/api/NotificationMessage;
    .locals 0

    .line 1
    .line 2
    iput-byte p1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->platform:B

    .line 3
    return-object p0
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public setPlatformMessageId(Ljava/lang/String;)Lcn/jiguang/privates/push/api/NotificationMessage;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->platformMessageId:Ljava/lang/String;

    .line 3
    return-object p0
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public setPriority(I)Lcn/jiguang/privates/push/api/NotificationMessage;
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->priority:I

    .line 3
    return-object p0
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public setSmallIcon(Ljava/lang/String;)Lcn/jiguang/privates/push/api/NotificationMessage;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->smallIcon:Ljava/lang/String;

    .line 3
    return-object p0
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public setSound(Ljava/lang/String;)Lcn/jiguang/privates/push/api/NotificationMessage;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->sound:Ljava/lang/String;

    .line 3
    return-object p0
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public setStyle(I)Lcn/jiguang/privates/push/api/NotificationMessage;
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->style:I

    .line 3
    return-object p0
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public setTitle(Ljava/lang/String;)Lcn/jiguang/privates/push/api/NotificationMessage;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->title:Ljava/lang/String;

    .line 3
    return-object p0
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "\n{\n  messageId="

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    iget-object v1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->messageId:Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v1, ",\n  overrideMessageId="

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    iget-object v1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->overrideMessageId:Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v1, ",\n  platform="

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    iget-byte v1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->platform:B

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v1, ",\n  platformMessageId=\'"

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    iget-object v1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->platformMessageId:Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v1, ",\n  notificationId="

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    iget v1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->notificationId:I

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v1, ",\n  smallIcon="

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    iget-object v1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->smallIcon:Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    const-string v1, ",\n  largeIcon="

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    iget-object v1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->largeIcon:Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    const-string v1, ",\n  title="

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    iget-object v1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->title:Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    const-string v1, ",\n  content="

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    iget-object v1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->content:Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    const-string v1, ",\n  extras="

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    iget-object v1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->extras:Landroid/os/Bundle;

    .line 103
    .line 104
    .line 105
    invoke-static {v1}, Lcn/jiguang/privates/common/log/JCommonLog;->toLogString(Landroid/os/Bundle;)Ljava/lang/String;

    .line 106
    move-result-object v1

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    const-string v1, ",\n  layoutId="

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    iget v1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->builderId:I

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    const-string v1, ",\n  style="

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    iget v1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->style:I

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    const-string v1, ",\n  bigText="

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    iget-object v1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->bigText:Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    const-string v1, ",\n  inbox="

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    iget-object v1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->inbox:[Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 150
    move-result-object v1

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    const-string v1, ",\n  bigPicture="

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    iget-object v1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->bigPicture:Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    const-string v1, ",\n  priority="

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    iget v1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->priority:I

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    const-string v1, ",\n  defaults="

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    iget v1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->defaults:I

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    const-string v1, ",\n  category="

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    iget-object v1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->category:Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    const-string v1, ",\n  sound="

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    iget-object v1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->sound:Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    const-string v1, ",\n  channelId="

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    iget-object v1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->channelId:Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    const-string v1, ",\n  intentUri="

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    iget-object v1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->intentUri:Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    const-string v1, ",\n  badge="

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    iget v1, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->badge:I

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    const-string v1, ",\n}"

    .line 236
    .line 237
    .line 238
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 242
    move-result-object v0

    .line 243
    return-object v0
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
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    .line 2
    iget-object p2, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->messageId:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object p2, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->overrideMessageId:Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 11
    .line 12
    iget-byte p2, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->platform:B

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 16
    .line 17
    iget-object p2, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->platformMessageId:Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 21
    .line 22
    iget p2, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->notificationId:I

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 26
    .line 27
    iget-object p2, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->smallIcon:Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 31
    .line 32
    iget-object p2, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->largeIcon:Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 36
    .line 37
    iget-object p2, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->title:Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 41
    .line 42
    iget-object p2, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->content:Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 46
    .line 47
    iget-object p2, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->extras:Landroid/os/Bundle;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    .line 51
    .line 52
    iget p2, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->builderId:I

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 56
    .line 57
    iget p2, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->style:I

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 61
    .line 62
    iget-object p2, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->bigText:Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 66
    .line 67
    iget-object p2, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->inbox:[Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    .line 71
    .line 72
    iget-object p2, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->bigPicture:Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 76
    .line 77
    iget p2, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->priority:I

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 81
    .line 82
    iget p2, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->defaults:I

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 86
    .line 87
    iget-object p2, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->category:Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 91
    .line 92
    iget-object p2, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->sound:Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 96
    .line 97
    iget-object p2, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->channelId:Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 101
    .line 102
    iget-object p2, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->intentUri:Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 106
    .line 107
    iget p2, p0, Lcn/jiguang/privates/push/api/NotificationMessage;->badge:I

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 111
    return-void
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
.end method
