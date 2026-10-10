.class public final enum Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog$SelectionMode;
.super Ljava/lang/Enum;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "SelectionMode"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog$SelectionMode;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0081\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\u0008J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u0008j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog$SelectionMode;",
        "Landroid/os/Parcelable;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "SINGLE",
        "MULTI",
        "describeContents",
        "",
        "writeToParcel",
        "",
        "dest",
        "Landroid/os/Parcel;",
        "flags",
        "idensic-mobile-sdk-aar_defaultRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog$SelectionMode;

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog$SelectionMode;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum MULTI:Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog$SelectionMode;

.field public static final enum SINGLE:Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog$SelectionMode;


# direct methods
.method private static final synthetic $values()[Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog$SelectionMode;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog$SelectionMode;->SINGLE:Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog$SelectionMode;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog$SelectionMode;->MULTI:Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog$SelectionMode;

    .line 5
    .line 6
    .line 7
    filled-new-array {v0, v1}, [Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog$SelectionMode;

    .line 8
    move-result-object v0

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog$SelectionMode;

    .line 3
    .line 4
    const-string v1, "SINGLE"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog$SelectionMode;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    sput-object v0, Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog$SelectionMode;->SINGLE:Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog$SelectionMode;

    .line 11
    .line 12
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog$SelectionMode;

    .line 13
    .line 14
    const-string v1, "MULTI"

    .line 15
    const/4 v2, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog$SelectionMode;-><init>(Ljava/lang/String;I)V

    .line 19
    .line 20
    sput-object v0, Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog$SelectionMode;->MULTI:Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog$SelectionMode;

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog$SelectionMode;->$values()[Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog$SelectionMode;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    sput-object v0, Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog$SelectionMode;->$VALUES:[Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog$SelectionMode;

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    sput-object v0, Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog$SelectionMode;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 33
    .line 34
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/country/picker/p;

    .line 35
    .line 36
    .line 37
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/country/picker/p;-><init>()V

    .line 38
    .line 39
    sput-object v0, Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog$SelectionMode;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 40
    return-void
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
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

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
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog$SelectionMode;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog$SelectionMode;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

.method public static valueOf(Ljava/lang/String;)Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog$SelectionMode;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog$SelectionMode;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog$SelectionMode;

    .line 9
    return-object p0
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
    .line 25
.end method

.method public static values()[Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog$SelectionMode;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog$SelectionMode;->$VALUES:[Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog$SelectionMode;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog$SelectionMode;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method


# virtual methods
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
    .locals 0
    .param p1    # Landroid/os/Parcel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 4
    move-result-object p2

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

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
.end method
