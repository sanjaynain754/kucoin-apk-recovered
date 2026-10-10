.class public Lai/advance/sdk/global/iqa/lib/IQAPageState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lai/advance/sdk/global/iqa/lib/IQAPageState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private cameraAngle:I

.field public cropParams:Lai/advance/sdk/global/iqa/lib/data/CropParams;

.field private givenMode:Lai/advance/sdk/global/iqa/lib/enums/Mode;

.field private inputCardSide:Lai/advance/sdk/global/iqa/lib/enums/CardSide;

.field private inputCardType:Lai/advance/sdk/global/iqa/lib/enums/CardType;

.field private mCameraId:I

.field private mCameraIdInitialized:Z

.field public mIqaExtras:Lai/advance/sdk/global/iqa/lib/IQAExtras;

.field public mSoundPlayEnable:Z

.field private maxRetryTimes:I

.field private pageId:Ljava/lang/String;

.field private region:Ljava/lang/String;

.field private remainingRetryTimes:I

.field private returnEmpty:Z

.field private screenOrientation:Ljava/lang/Integer;

.field private screenOrientationRotateHistory:Ljava/lang/String;

.field private takePhotoTipDialogShowingSeconds:I

.field private timeoutSeconds:I

.field private transactionId:Ljava/lang/String;

.field public uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lai/advance/sdk/global/iqa/lib/IQAPageState$a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lai/advance/sdk/global/iqa/lib/IQAPageState$a;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->CREATOR:Landroid/os/Parcelable$Creator;

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
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->mCameraId:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->mCameraIdInitialized:Z

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/util/Random;

    invoke-direct {v1}, Ljava/util/Random;-><init>()V

    const/16 v2, 0x64

    invoke-virtual {v1, v2}, Ljava/util/Random;->nextInt(I)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->transactionId:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->screenOrientationRotateHistory:Ljava/lang/String;

    sget-object v0, Lai/advance/sdk/global/iqa/lib/enums/CardSide;->FRONT:Lai/advance/sdk/global/iqa/lib/enums/CardSide;

    iput-object v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->inputCardSide:Lai/advance/sdk/global/iqa/lib/enums/CardSide;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 6

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->mCameraId:I

    const/4 v1, 0x0

    iput-boolean v1, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->mCameraIdInitialized:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    iput v2, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->remainingRetryTimes:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    iput v2, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->maxRetryTimes:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    iput-boolean v2, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->returnEmpty:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->transactionId:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    const/4 v4, 0x0

    if-ne v2, v0, :cond_1

    move-object v2, v4

    goto :goto_1

    :cond_1
    invoke-static {}, Lai/advance/sdk/global/iqa/lib/enums/CardSide;->values()[Lai/advance/sdk/global/iqa/lib/enums/CardSide;

    move-result-object v5

    aget-object v2, v5, v2

    :goto_1
    iput-object v2, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->inputCardSide:Lai/advance/sdk/global/iqa/lib/enums/CardSide;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-ne v2, v0, :cond_2

    move-object v2, v4

    goto :goto_2

    :cond_2
    invoke-static {}, Lai/advance/sdk/global/iqa/lib/enums/CardType;->values()[Lai/advance/sdk/global/iqa/lib/enums/CardType;

    move-result-object v5

    aget-object v2, v5, v2

    :goto_2
    iput-object v2, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->inputCardType:Lai/advance/sdk/global/iqa/lib/enums/CardType;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    iput v2, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->takePhotoTipDialogShowingSeconds:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->pageId:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->region:Ljava/lang/String;

    const-class v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    iput-object v2, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->screenOrientation:Ljava/lang/Integer;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->screenOrientationRotateHistory:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    iput v2, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->timeoutSeconds:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    iput v2, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->cameraAngle:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-ne v2, v0, :cond_3

    goto :goto_3

    :cond_3
    invoke-static {}, Lai/advance/sdk/global/iqa/lib/enums/Mode;->values()[Lai/advance/sdk/global/iqa/lib/enums/Mode;

    move-result-object v0

    aget-object v4, v0, v2

    :goto_3
    iput-object v4, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->givenMode:Lai/advance/sdk/global/iqa/lib/enums/Mode;

    const-class v0, Lai/advance/sdk/global/iqa/lib/data/CropParams;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lai/advance/sdk/global/iqa/lib/data/CropParams;

    iput-object v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->cropParams:Lai/advance/sdk/global/iqa/lib/data/CropParams;

    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_4

    move v1, v3

    :cond_4
    iput-boolean v1, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->mSoundPlayEnable:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lai/advance/sdk/global/iqa/lib/UIExtras;

    iput-object v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lai/advance/sdk/global/iqa/lib/IQAExtras;

    iput-object v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->mIqaExtras:Lai/advance/sdk/global/iqa/lib/IQAExtras;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->mCameraId:I

    iput-boolean v3, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->mCameraIdInitialized:Z

    return-void
.end method


# virtual methods
.method public canRetry()Z
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->remainingRetryTimes:I

    .line 3
    .line 4
    if-lez v0, :cond_0

    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
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
.end method

.method public costOneTime()V
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->remainingRetryTimes:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, -0x1

    .line 5
    .line 6
    iput v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->remainingRetryTimes:I

    .line 7
    return-void
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
.end method

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
    .line 19
    .line 20
.end method

.method public getCameraAngle()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->cameraAngle:I

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
    .line 19
    .line 20
.end method

.method public getCameraId()I
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->mCameraIdInitialized:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lk/c;->d()I

    .line 8
    move-result v0

    .line 9
    .line 10
    iput v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->mCameraId:I

    .line 11
    const/4 v0, 0x1

    .line 12
    .line 13
    iput-boolean v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->mCameraIdInitialized:Z

    .line 14
    .line 15
    :cond_0
    iget v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->mCameraId:I

    .line 16
    return v0
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public getGivenMode()Lai/advance/sdk/global/iqa/lib/enums/Mode;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->givenMode:Lai/advance/sdk/global/iqa/lib/enums/Mode;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    sget-object v0, Lai/advance/sdk/global/iqa/lib/enums/Mode;->DEFAULT:Lai/advance/sdk/global/iqa/lib/enums/Mode;

    .line 7
    :cond_0
    return-object v0
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
.end method

.method public getInputCardSide()Lai/advance/sdk/global/iqa/lib/enums/CardSide;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->inputCardSide:Lai/advance/sdk/global/iqa/lib/enums/CardSide;

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
    .line 19
    .line 20
.end method

.method public getInputCardType()Lai/advance/sdk/global/iqa/lib/enums/CardType;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->inputCardType:Lai/advance/sdk/global/iqa/lib/enums/CardType;

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
    .line 19
    .line 20
.end method

.method public getMaxRetryTimes()I
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->maxRetryTimes:I

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 7
    move-result v0

    .line 8
    return v0
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
.end method

.method public getPageId()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->pageId:Ljava/lang/String;

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
    .line 19
    .line 20
.end method

.method public getRegion()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->region:Ljava/lang/String;

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
    .line 19
    .line 20
.end method

.method public getRemainingRetryTimes()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->remainingRetryTimes:I

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
    .line 19
    .line 20
.end method

.method public getScreenOrientation()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->screenOrientation:Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public getScreenOrientationRotateHistory()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->screenOrientationRotateHistory:Ljava/lang/String;

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
    .line 19
    .line 20
.end method

.method public getTakePhotoTipDialogShowingSeconds()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->takePhotoTipDialogShowingSeconds:I

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
    .line 19
    .line 20
.end method

.method public getTimeoutSeconds()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->timeoutSeconds:I

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
    .line 19
    .line 20
.end method

.method public getTransactionId()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->transactionId:Ljava/lang/String;

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
    .line 19
    .line 20
.end method

.method public isFrontCamera()Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/lib/IQAPageState;->getCameraId()I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lk/c;->f()I

    .line 8
    move-result v1

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public isFrontCardSide()Z
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lai/advance/sdk/global/iqa/lib/enums/CardSide;->FRONT:Lai/advance/sdk/global/iqa/lib/enums/CardSide;

    .line 3
    .line 4
    iget-object v1, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->inputCardSide:Lai/advance/sdk/global/iqa/lib/enums/CardSide;

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
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
.end method

.method public isPortrait()Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/lib/IQAPageState;->getScreenOrientation()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    return v1

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
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
.end method

.method public isReturnEmpty()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->returnEmpty:Z

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
    .line 19
    .line 20
.end method

.method public isScanMode()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/lib/IQAPageState;->canRetry()Z

    .line 4
    move-result v0

    .line 5
    return v0
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
.end method

.method public readFromParcel(Landroid/os/Parcel;)V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 4
    move-result v0

    .line 5
    .line 6
    iput v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->remainingRetryTimes:I

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 10
    move-result v0

    .line 11
    .line 12
    iput v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->maxRetryTimes:I

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x0

    .line 18
    const/4 v2, 0x1

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    move v0, v2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v0, v1

    .line 24
    .line 25
    :goto_0
    iput-boolean v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->returnEmpty:Z

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    iput-object v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->transactionId:Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 35
    move-result v0

    .line 36
    const/4 v3, 0x0

    .line 37
    const/4 v4, -0x1

    .line 38
    .line 39
    if-ne v0, v4, :cond_1

    .line 40
    move-object v0, v3

    .line 41
    goto :goto_1

    .line 42
    .line 43
    .line 44
    :cond_1
    invoke-static {}, Lai/advance/sdk/global/iqa/lib/enums/CardSide;->values()[Lai/advance/sdk/global/iqa/lib/enums/CardSide;

    .line 45
    move-result-object v5

    .line 46
    .line 47
    aget-object v0, v5, v0

    .line 48
    .line 49
    :goto_1
    iput-object v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->inputCardSide:Lai/advance/sdk/global/iqa/lib/enums/CardSide;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 53
    move-result v0

    .line 54
    .line 55
    if-ne v0, v4, :cond_2

    .line 56
    move-object v0, v3

    .line 57
    goto :goto_2

    .line 58
    .line 59
    .line 60
    :cond_2
    invoke-static {}, Lai/advance/sdk/global/iqa/lib/enums/CardType;->values()[Lai/advance/sdk/global/iqa/lib/enums/CardType;

    .line 61
    move-result-object v5

    .line 62
    .line 63
    aget-object v0, v5, v0

    .line 64
    .line 65
    :goto_2
    iput-object v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->inputCardType:Lai/advance/sdk/global/iqa/lib/enums/CardType;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 69
    move-result v0

    .line 70
    .line 71
    iput v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->takePhotoTipDialogShowingSeconds:I

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 75
    move-result-object v0

    .line 76
    .line 77
    iput-object v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->pageId:Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 81
    move-result-object v0

    .line 82
    .line 83
    iput-object v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->region:Ljava/lang/String;

    .line 84
    .line 85
    const-class v0, Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 89
    move-result-object v0

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 93
    move-result-object v0

    .line 94
    .line 95
    check-cast v0, Ljava/lang/Integer;

    .line 96
    .line 97
    iput-object v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->screenOrientation:Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 101
    move-result-object v0

    .line 102
    .line 103
    iput-object v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->screenOrientationRotateHistory:Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 107
    move-result v0

    .line 108
    .line 109
    iput v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->timeoutSeconds:I

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 113
    move-result v0

    .line 114
    .line 115
    iput v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->cameraAngle:I

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 119
    move-result v0

    .line 120
    .line 121
    if-ne v0, v4, :cond_3

    .line 122
    goto :goto_3

    .line 123
    .line 124
    .line 125
    :cond_3
    invoke-static {}, Lai/advance/sdk/global/iqa/lib/enums/Mode;->values()[Lai/advance/sdk/global/iqa/lib/enums/Mode;

    .line 126
    move-result-object v3

    .line 127
    .line 128
    aget-object v3, v3, v0

    .line 129
    .line 130
    :goto_3
    iput-object v3, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->givenMode:Lai/advance/sdk/global/iqa/lib/enums/Mode;

    .line 131
    .line 132
    const-class v0, Lai/advance/sdk/global/iqa/lib/data/CropParams;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 136
    move-result-object v0

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 140
    move-result-object v0

    .line 141
    .line 142
    check-cast v0, Lai/advance/sdk/global/iqa/lib/data/CropParams;

    .line 143
    .line 144
    iput-object v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->cropParams:Lai/advance/sdk/global/iqa/lib/data/CropParams;

    .line 145
    .line 146
    .line 147
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    .line 148
    move-result v0

    .line 149
    .line 150
    if-eqz v0, :cond_4

    .line 151
    move v1, v2

    .line 152
    .line 153
    :cond_4
    iput-boolean v1, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->mSoundPlayEnable:Z

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 157
    move-result-object v0

    .line 158
    .line 159
    check-cast v0, Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 160
    .line 161
    iput-object v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 162
    .line 163
    .line 164
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 165
    move-result-object v0

    .line 166
    .line 167
    check-cast v0, Lai/advance/sdk/global/iqa/lib/IQAExtras;

    .line 168
    .line 169
    iput-object v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->mIqaExtras:Lai/advance/sdk/global/iqa/lib/IQAExtras;

    .line 170
    .line 171
    .line 172
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 173
    move-result p1

    .line 174
    .line 175
    iput p1, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->mCameraId:I

    .line 176
    .line 177
    iput-boolean v2, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->mCameraIdInitialized:Z

    .line 178
    return-void
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
.end method

.method public setCameraAngle(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->cameraAngle:I

    .line 3
    return-void
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
    .line 24
.end method

.method public setCameraId(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->mCameraId:I

    .line 3
    const/4 p1, 0x1

    .line 4
    .line 5
    iput-boolean p1, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->mCameraIdInitialized:Z

    .line 6
    return-void
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

.method public setIQAExtras(Lai/advance/sdk/global/iqa/lib/IQAExtras;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lai/advance/sdk/global/iqa/lib/IQAExtras;->getCardType()Lai/advance/sdk/global/iqa/lib/enums/CardType;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iput-object v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->inputCardType:Lai/advance/sdk/global/iqa/lib/enums/CardType;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lai/advance/sdk/global/iqa/lib/IQAExtras;->getCardSide()Lai/advance/sdk/global/iqa/lib/enums/CardSide;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    iput-object v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->inputCardSide:Lai/advance/sdk/global/iqa/lib/enums/CardSide;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lai/advance/sdk/global/iqa/lib/IQAExtras;->getMode()Lai/advance/sdk/global/iqa/lib/enums/Mode;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    iput-object v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->givenMode:Lai/advance/sdk/global/iqa/lib/enums/Mode;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lai/advance/sdk/global/iqa/lib/IQAExtras;->isSoundPlayEnable()Z

    .line 22
    move-result v0

    .line 23
    .line 24
    iput-boolean v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->mSoundPlayEnable:Z

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lai/advance/sdk/global/iqa/lib/IQAExtras;->getMaxRetryTimes()I

    .line 28
    move-result v0

    .line 29
    .line 30
    iput v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->maxRetryTimes:I

    .line 31
    .line 32
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->givenMode:Lai/advance/sdk/global/iqa/lib/enums/Mode;

    .line 33
    .line 34
    sget-object v1, Lai/advance/sdk/global/iqa/lib/enums/Mode;->TAKE_PHOTO:Lai/advance/sdk/global/iqa/lib/enums/Mode;

    .line 35
    const/4 v2, 0x0

    .line 36
    .line 37
    if-ne v0, v1, :cond_0

    .line 38
    .line 39
    iput v2, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->maxRetryTimes:I

    .line 40
    .line 41
    :cond_0
    iget v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->maxRetryTimes:I

    .line 42
    .line 43
    iput v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->remainingRetryTimes:I

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Lai/advance/sdk/global/iqa/lib/IQAExtras;->getRegion()Ljava/lang/String;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    iput-object v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->region:Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Lai/advance/sdk/global/iqa/lib/IQAExtras;->isReturnEmpty()Z

    .line 53
    move-result v0

    .line 54
    .line 55
    iput-boolean v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->returnEmpty:Z

    .line 56
    .line 57
    iput-object p1, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->mIqaExtras:Lai/advance/sdk/global/iqa/lib/IQAExtras;

    .line 58
    .line 59
    iget-object p1, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 60
    .line 61
    if-nez p1, :cond_1

    .line 62
    .line 63
    const/16 p1, 0x14

    .line 64
    .line 65
    iput p1, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->timeoutSeconds:I

    .line 66
    .line 67
    iput v2, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->takePhotoTipDialogShowingSeconds:I

    .line 68
    :cond_1
    return-void
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
.end method

.method public setPageId(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->pageId:Ljava/lang/String;

    .line 3
    return-void
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
    .line 24
.end method

.method public setScreenOrientation(I)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iput-object v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->screenOrientation:Ljava/lang/Integer;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    iget-object v1, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->screenOrientationRotateHistory:Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    iput-object p1, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->screenOrientationRotateHistory:Ljava/lang/String;

    .line 26
    return-void
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
.end method

.method public setUIExtras(Lai/advance/sdk/global/iqa/lib/UIExtras;)V
    .locals 1

    .line 1
    .line 2
    iput-object p1, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lai/advance/sdk/global/iqa/lib/UIExtras;->getScanLimitSeconds()Ljava/lang/Integer;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 10
    move-result v0

    .line 11
    .line 12
    iput v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->timeoutSeconds:I

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lai/advance/sdk/global/iqa/lib/UIExtras;->getTakePhotoTipDialogShowSeconds()Ljava/lang/Integer;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 20
    move-result p1

    .line 21
    .line 22
    iput p1, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->takePhotoTipDialogShowingSeconds:I

    .line 23
    return-void
    .line 24
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->remainingRetryTimes:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 6
    .line 7
    iget v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->maxRetryTimes:I

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 11
    .line 12
    iget-boolean v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->returnEmpty:Z

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 16
    .line 17
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->transactionId:Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 21
    .line 22
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->inputCardSide:Lai/advance/sdk/global/iqa/lib/enums/CardSide;

    .line 23
    const/4 v1, -0x1

    .line 24
    .line 25
    if-nez v0, :cond_0

    .line 26
    move v0, v1

    .line 27
    goto :goto_0

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 31
    move-result v0

    .line 32
    .line 33
    .line 34
    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 35
    .line 36
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->inputCardType:Lai/advance/sdk/global/iqa/lib/enums/CardType;

    .line 37
    .line 38
    if-nez v0, :cond_1

    .line 39
    move v0, v1

    .line 40
    goto :goto_1

    .line 41
    .line 42
    .line 43
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 44
    move-result v0

    .line 45
    .line 46
    .line 47
    :goto_1
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 48
    .line 49
    iget v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->takePhotoTipDialogShowingSeconds:I

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 53
    .line 54
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->pageId:Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 58
    .line 59
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->region:Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 63
    .line 64
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->screenOrientation:Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 68
    .line 69
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->screenOrientationRotateHistory:Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 73
    .line 74
    iget v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->timeoutSeconds:I

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 78
    .line 79
    iget v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->cameraAngle:I

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 83
    .line 84
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->givenMode:Lai/advance/sdk/global/iqa/lib/enums/Mode;

    .line 85
    .line 86
    if-nez v0, :cond_2

    .line 87
    goto :goto_2

    .line 88
    .line 89
    .line 90
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 91
    move-result v1

    .line 92
    .line 93
    .line 94
    :goto_2
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 95
    .line 96
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->cropParams:Lai/advance/sdk/global/iqa/lib/data/CropParams;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 100
    .line 101
    iget-boolean p2, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->mSoundPlayEnable:Z

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 105
    .line 106
    iget-object p2, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 110
    .line 111
    iget-object p2, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->mIqaExtras:Lai/advance/sdk/global/iqa/lib/IQAExtras;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 115
    .line 116
    iget p2, p0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->mCameraId:I

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 120
    return-void
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
.end method
