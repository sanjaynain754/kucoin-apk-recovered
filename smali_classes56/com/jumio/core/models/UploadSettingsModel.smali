.class public final Lcom/jumio/core/models/UploadSettingsModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jumio/core/model/StaticModel;


# annotations
.annotation runtime Lcom/jumio/commons/PersistWith;
    value = "UploadSettingsModel"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jumio/core/models/UploadSettingsModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u0000 \u000c2\u00020\u0001:\u0001\u000cB\u001b\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\t\u0010\u0008\"\u0004\u0008\n\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/jumio/core/models/UploadSettingsModel;",
        "Lcom/jumio/core/model/StaticModel;",
        "requestedImageResolution",
        "Lcom/jumio/core/enums/UploadResolution;",
        "uploadImageResolution",
        "<init>",
        "(Lcom/jumio/core/enums/UploadResolution;Lcom/jumio/core/enums/UploadResolution;)V",
        "getRequestedImageResolution",
        "()Lcom/jumio/core/enums/UploadResolution;",
        "getUploadImageResolution",
        "setUploadImageResolution",
        "(Lcom/jumio/core/enums/UploadResolution;)V",
        "Companion",
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


# static fields
.field public static final Companion:Lcom/jumio/core/models/UploadSettingsModel$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lcom/jumio/core/enums/UploadResolution;

.field public b:Lcom/jumio/core/enums/UploadResolution;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/jumio/core/models/UploadSettingsModel$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/jumio/core/models/UploadSettingsModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/jumio/core/models/UploadSettingsModel;->Companion:Lcom/jumio/core/models/UploadSettingsModel$Companion;

    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x3

    .line 1
    invoke-direct {p0, v0, v0, v1, v0}, Lcom/jumio/core/models/UploadSettingsModel;-><init>(Lcom/jumio/core/enums/UploadResolution;Lcom/jumio/core/enums/UploadResolution;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/jumio/core/enums/UploadResolution;Lcom/jumio/core/enums/UploadResolution;)V
    .locals 1
    .param p1    # Lcom/jumio/core/enums/UploadResolution;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/jumio/core/enums/UploadResolution;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "requestedImageResolution"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uploadImageResolution"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/jumio/core/models/UploadSettingsModel;->a:Lcom/jumio/core/enums/UploadResolution;

    .line 7
    iput-object p2, p0, Lcom/jumio/core/models/UploadSettingsModel;->b:Lcom/jumio/core/enums/UploadResolution;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/jumio/core/enums/UploadResolution;Lcom/jumio/core/enums/UploadResolution;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    .line 2
    sget-object p1, Ljumio/core/Z3;->a:Lcom/jumio/core/enums/UploadResolution;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 3
    sget-object p2, Ljumio/core/Z3;->a:Lcom/jumio/core/enums/UploadResolution;

    .line 4
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/jumio/core/models/UploadSettingsModel;-><init>(Lcom/jumio/core/enums/UploadResolution;Lcom/jumio/core/enums/UploadResolution;)V

    return-void
.end method


# virtual methods
.method public final getRequestedImageResolution()Lcom/jumio/core/enums/UploadResolution;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/models/UploadSettingsModel;->a:Lcom/jumio/core/enums/UploadResolution;

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

.method public final getUploadImageResolution()Lcom/jumio/core/enums/UploadResolution;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/models/UploadSettingsModel;->b:Lcom/jumio/core/enums/UploadResolution;

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

.method public final setUploadImageResolution(Lcom/jumio/core/enums/UploadResolution;)V
    .locals 1
    .param p1    # Lcom/jumio/core/enums/UploadResolution;
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
    iput-object p1, p0, Lcom/jumio/core/models/UploadSettingsModel;->b:Lcom/jumio/core/enums/UploadResolution;

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
