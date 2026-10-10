.class public Lcn/jiguang/privates/push/api/NotificationLayout;
.super Ljava/lang/Object;
.source "NotificationLayout.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcn/jiguang/privates/push/api/NotificationLayout;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private contentViewId:I

.field private iconResourceId:I

.field private iconViewId:I

.field private layoutId:I

.field private timeViewId:I

.field private titleViewId:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcn/jiguang/privates/push/api/NotificationLayout$1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcn/jiguang/privates/push/api/NotificationLayout$1;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcn/jiguang/privates/push/api/NotificationLayout;->CREATOR:Landroid/os/Parcelable$Creator;

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
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcn/jiguang/privates/push/api/NotificationLayout;->layoutId:I

    .line 3
    iput v0, p0, Lcn/jiguang/privates/push/api/NotificationLayout;->iconViewId:I

    .line 4
    iput v0, p0, Lcn/jiguang/privates/push/api/NotificationLayout;->iconResourceId:I

    .line 5
    iput v0, p0, Lcn/jiguang/privates/push/api/NotificationLayout;->titleViewId:I

    .line 6
    iput v0, p0, Lcn/jiguang/privates/push/api/NotificationLayout;->contentViewId:I

    .line 7
    iput v0, p0, Lcn/jiguang/privates/push/api/NotificationLayout;->timeViewId:I

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 9
    iput v0, p0, Lcn/jiguang/privates/push/api/NotificationLayout;->layoutId:I

    .line 10
    iput v0, p0, Lcn/jiguang/privates/push/api/NotificationLayout;->iconViewId:I

    .line 11
    iput v0, p0, Lcn/jiguang/privates/push/api/NotificationLayout;->iconResourceId:I

    .line 12
    iput v0, p0, Lcn/jiguang/privates/push/api/NotificationLayout;->titleViewId:I

    .line 13
    iput v0, p0, Lcn/jiguang/privates/push/api/NotificationLayout;->contentViewId:I

    .line 14
    iput v0, p0, Lcn/jiguang/privates/push/api/NotificationLayout;->timeViewId:I

    .line 15
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcn/jiguang/privates/push/api/NotificationLayout;->layoutId:I

    .line 16
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcn/jiguang/privates/push/api/NotificationLayout;->iconViewId:I

    .line 17
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcn/jiguang/privates/push/api/NotificationLayout;->iconResourceId:I

    .line 18
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcn/jiguang/privates/push/api/NotificationLayout;->titleViewId:I

    .line 19
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcn/jiguang/privates/push/api/NotificationLayout;->contentViewId:I

    .line 20
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Lcn/jiguang/privates/push/api/NotificationLayout;->timeViewId:I

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

.method public getContentViewId()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcn/jiguang/privates/push/api/NotificationLayout;->contentViewId:I

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

.method public getIconResourceId()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcn/jiguang/privates/push/api/NotificationLayout;->iconResourceId:I

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

.method public getIconViewId()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcn/jiguang/privates/push/api/NotificationLayout;->iconViewId:I

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

.method public getLayoutId()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcn/jiguang/privates/push/api/NotificationLayout;->layoutId:I

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

.method public getTimeViewId()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcn/jiguang/privates/push/api/NotificationLayout;->timeViewId:I

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

.method public getTitleViewId()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcn/jiguang/privates/push/api/NotificationLayout;->titleViewId:I

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

.method public setContentViewId(I)Lcn/jiguang/privates/push/api/NotificationLayout;
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcn/jiguang/privates/push/api/NotificationLayout;->contentViewId:I

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

.method public setIconResourceId(I)Lcn/jiguang/privates/push/api/NotificationLayout;
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcn/jiguang/privates/push/api/NotificationLayout;->iconResourceId:I

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

.method public setIconViewId(I)Lcn/jiguang/privates/push/api/NotificationLayout;
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcn/jiguang/privates/push/api/NotificationLayout;->iconViewId:I

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

.method public setLayoutId(I)Lcn/jiguang/privates/push/api/NotificationLayout;
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcn/jiguang/privates/push/api/NotificationLayout;->layoutId:I

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

.method public setTimeViewId(I)Lcn/jiguang/privates/push/api/NotificationLayout;
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcn/jiguang/privates/push/api/NotificationLayout;->timeViewId:I

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

.method public setTitleViewId(I)Lcn/jiguang/privates/push/api/NotificationLayout;
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcn/jiguang/privates/push/api/NotificationLayout;->titleViewId:I

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
    const-string v1, "\n{\n  layoutId="

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    iget v1, p0, Lcn/jiguang/privates/push/api/NotificationLayout;->layoutId:I

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v1, ",\n  iconViewId="

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    iget v1, p0, Lcn/jiguang/privates/push/api/NotificationLayout;->iconViewId:I

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v1, ",\n  titleViewId="

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    iget v1, p0, Lcn/jiguang/privates/push/api/NotificationLayout;->titleViewId:I

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v1, ",\n  contentViewId="

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    iget v1, p0, Lcn/jiguang/privates/push/api/NotificationLayout;->contentViewId:I

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v1, ",\n  timeViewId="

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    iget v1, p0, Lcn/jiguang/privates/push/api/NotificationLayout;->timeViewId:I

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v1, "\n}"

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    move-result-object v0

    .line 65
    return-object v0
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
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    .line 2
    iget p2, p0, Lcn/jiguang/privates/push/api/NotificationLayout;->layoutId:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 6
    .line 7
    iget p2, p0, Lcn/jiguang/privates/push/api/NotificationLayout;->iconViewId:I

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 11
    .line 12
    iget p2, p0, Lcn/jiguang/privates/push/api/NotificationLayout;->iconResourceId:I

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 16
    .line 17
    iget p2, p0, Lcn/jiguang/privates/push/api/NotificationLayout;->titleViewId:I

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 21
    .line 22
    iget p2, p0, Lcn/jiguang/privates/push/api/NotificationLayout;->contentViewId:I

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 26
    .line 27
    iget p2, p0, Lcn/jiguang/privates/push/api/NotificationLayout;->timeViewId:I

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 31
    return-void
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
