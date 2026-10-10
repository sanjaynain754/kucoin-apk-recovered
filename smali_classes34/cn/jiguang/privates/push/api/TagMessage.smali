.class public Lcn/jiguang/privates/push/api/TagMessage;
.super Ljava/lang/Object;
.source "TagMessage.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcn/jiguang/privates/push/api/TagMessage;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private code:I

.field private queryTag:Ljava/lang/String;

.field private queryTagValid:Z

.field private sequence:I

.field private tags:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcn/jiguang/privates/push/api/TagMessage$1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcn/jiguang/privates/push/api/TagMessage$1;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcn/jiguang/privates/push/api/TagMessage;->CREATOR:Landroid/os/Parcelable$Creator;

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
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcn/jiguang/privates/push/api/TagMessage;->sequence:I

    const/4 v1, -0x1

    .line 3
    iput v1, p0, Lcn/jiguang/privates/push/api/TagMessage;->code:I

    .line 4
    new-array v1, v0, [Ljava/lang/String;

    iput-object v1, p0, Lcn/jiguang/privates/push/api/TagMessage;->tags:[Ljava/lang/String;

    .line 5
    const-string v1, ""

    iput-object v1, p0, Lcn/jiguang/privates/push/api/TagMessage;->queryTag:Ljava/lang/String;

    .line 6
    iput-boolean v0, p0, Lcn/jiguang/privates/push/api/TagMessage;->queryTagValid:Z

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 8
    iput v0, p0, Lcn/jiguang/privates/push/api/TagMessage;->sequence:I

    const/4 v1, -0x1

    .line 9
    iput v1, p0, Lcn/jiguang/privates/push/api/TagMessage;->code:I

    .line 10
    new-array v1, v0, [Ljava/lang/String;

    iput-object v1, p0, Lcn/jiguang/privates/push/api/TagMessage;->tags:[Ljava/lang/String;

    .line 11
    const-string v1, ""

    iput-object v1, p0, Lcn/jiguang/privates/push/api/TagMessage;->queryTag:Ljava/lang/String;

    .line 12
    iput-boolean v0, p0, Lcn/jiguang/privates/push/api/TagMessage;->queryTagValid:Z

    .line 13
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lcn/jiguang/privates/push/api/TagMessage;->sequence:I

    .line 14
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lcn/jiguang/privates/push/api/TagMessage;->code:I

    .line 15
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcn/jiguang/privates/push/api/TagMessage;->tags:[Ljava/lang/String;

    .line 16
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcn/jiguang/privates/push/api/TagMessage;->queryTag:Ljava/lang/String;

    .line 17
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result p1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :cond_0
    iput-boolean v0, p0, Lcn/jiguang/privates/push/api/TagMessage;->queryTagValid:Z

    return-void
.end method

.method public static getCREATOR()Landroid/os/Parcelable$Creator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/os/Parcelable$Creator<",
            "Lcn/jiguang/privates/push/api/TagMessage;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcn/jiguang/privates/push/api/TagMessage;->CREATOR:Landroid/os/Parcelable$Creator;

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

.method public getCode()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcn/jiguang/privates/push/api/TagMessage;->code:I

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

.method public getQueryTag()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcn/jiguang/privates/push/api/TagMessage;->queryTag:Ljava/lang/String;

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

.method public getSequence()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcn/jiguang/privates/push/api/TagMessage;->sequence:I

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

.method public getTags()[Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcn/jiguang/privates/push/api/TagMessage;->tags:[Ljava/lang/String;

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

.method public isQueryTagValid()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcn/jiguang/privates/push/api/TagMessage;->queryTagValid:Z

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

.method public setCode(I)Lcn/jiguang/privates/push/api/TagMessage;
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcn/jiguang/privates/push/api/TagMessage;->code:I

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

.method public setQueryTag(Ljava/lang/String;)Lcn/jiguang/privates/push/api/TagMessage;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcn/jiguang/privates/push/api/TagMessage;->queryTag:Ljava/lang/String;

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

.method public setQueryTagValid(Z)Lcn/jiguang/privates/push/api/TagMessage;
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcn/jiguang/privates/push/api/TagMessage;->queryTagValid:Z

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

.method public setSequence(I)Lcn/jiguang/privates/push/api/TagMessage;
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcn/jiguang/privates/push/api/TagMessage;->sequence:I

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

.method public setTags([Ljava/lang/String;)Lcn/jiguang/privates/push/api/TagMessage;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcn/jiguang/privates/push/api/TagMessage;->tags:[Ljava/lang/String;

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
    const-string v1, "\n{\n  sequence="

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    iget v1, p0, Lcn/jiguang/privates/push/api/TagMessage;->sequence:I

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v1, ",\n  code="

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    iget v1, p0, Lcn/jiguang/privates/push/api/TagMessage;->code:I

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v1, ",\n  tag="

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    iget-object v1, p0, Lcn/jiguang/privates/push/api/TagMessage;->tags:[Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v1, ",\n  queryTag="

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    iget-object v1, p0, Lcn/jiguang/privates/push/api/TagMessage;->queryTag:Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string v1, ",\n  queryTagValid="

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    iget-boolean v1, p0, Lcn/jiguang/privates/push/api/TagMessage;->queryTagValid:Z

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    const-string v1, "\n}"

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    move-result-object v0

    .line 69
    return-object v0
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    .line 2
    iget p2, p0, Lcn/jiguang/privates/push/api/TagMessage;->sequence:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 6
    .line 7
    iget p2, p0, Lcn/jiguang/privates/push/api/TagMessage;->code:I

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 11
    .line 12
    iget-object p2, p0, Lcn/jiguang/privates/push/api/TagMessage;->tags:[Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    .line 16
    .line 17
    iget-object p2, p0, Lcn/jiguang/privates/push/api/TagMessage;->queryTag:Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 21
    .line 22
    iget-boolean p2, p0, Lcn/jiguang/privates/push/api/TagMessage;->queryTagValid:Z

    .line 23
    int-to-byte p2, p2

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

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
.end method
