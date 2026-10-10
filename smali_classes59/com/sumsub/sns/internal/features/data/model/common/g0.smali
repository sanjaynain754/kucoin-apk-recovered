.class public final Lcom/sumsub/sns/internal/features/data/model/common/g0;
.super Lcom/sumsub/sns/internal/features/data/model/common/l0;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/sumsub/sns/internal/features/data/model/common/g0;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/Throwable;

.field public final b:Landroid/os/Parcelable;

.field public final c:Lcom/sumsub/sns/internal/features/data/model/common/c0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/f0;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/data/model/common/f0;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sns/internal/features/data/model/common/g0;->CREATOR:Landroid/os/Parcelable$Creator;

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
.end method

.method public constructor <init>(Ljava/lang/Throwable;Landroid/os/Parcelable;Lcom/sumsub/sns/internal/features/data/model/common/c0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/sumsub/sns/internal/features/data/model/common/l0;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/data/model/common/g0;->a:Ljava/lang/Throwable;

    .line 3
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/data/model/common/g0;->b:Landroid/os/Parcelable;

    .line 4
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/data/model/common/g0;->c:Lcom/sumsub/sns/internal/features/data/model/common/c0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;Landroid/os/Parcelable;Lcom/sumsub/sns/internal/features/data/model/common/c0;I)V
    .locals 2

    and-int/lit8 v0, p4, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object p1, v1

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    move-object p2, v1

    .line 5
    :cond_1
    invoke-direct {p0}, Lcom/sumsub/sns/internal/features/data/model/common/l0;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/data/model/common/g0;->a:Ljava/lang/Throwable;

    .line 7
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/data/model/common/g0;->b:Landroid/os/Parcelable;

    .line 8
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/data/model/common/g0;->c:Lcom/sumsub/sns/internal/features/data/model/common/c0;

    return-void
.end method


# virtual methods
.method public final b()Lcom/sumsub/sns/internal/features/data/model/common/c0;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/g0;->c:Lcom/sumsub/sns/internal/features/data/model/common/c0;

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
.end method

.method public final c()Ljava/lang/Throwable;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/g0;->a:Ljava/lang/Throwable;

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
.end method

.method public final d()Landroid/os/Parcelable;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/g0;->b:Landroid/os/Parcelable;

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
.end method

.method public final describeContents()I
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
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/g0;->a:Ljava/lang/Throwable;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/g0;->b:Landroid/os/Parcelable;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 11
    .line 12
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/g0;->c:Lcom/sumsub/sns/internal/features/data/model/common/c0;

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    const/4 p2, 0x0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 19
    return-void

    .line 20
    :cond_0
    const/4 v1, 0x1

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1, p2}, Lcom/sumsub/sns/internal/features/data/model/common/c0;->writeToParcel(Landroid/os/Parcel;I)V

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
.end method
