.class public Lcom/google/api/services/drive/DriveScopes;
.super Ljava/lang/Object;
.source "DriveScopes.java"


# static fields
.field public static final DRIVE:Ljava/lang/String; = "https://www.googleapis.com/auth/drive"

.field public static final DRIVE_APPDATA:Ljava/lang/String; = "https://www.googleapis.com/auth/drive.appdata"

.field public static final DRIVE_FILE:Ljava/lang/String; = "https://www.googleapis.com/auth/drive.file"

.field public static final DRIVE_METADATA:Ljava/lang/String; = "https://www.googleapis.com/auth/drive.metadata"

.field public static final DRIVE_METADATA_READONLY:Ljava/lang/String; = "https://www.googleapis.com/auth/drive.metadata.readonly"

.field public static final DRIVE_PHOTOS_READONLY:Ljava/lang/String; = "https://www.googleapis.com/auth/drive.photos.readonly"

.field public static final DRIVE_READONLY:Ljava/lang/String; = "https://www.googleapis.com/auth/drive.readonly"

.field public static final DRIVE_SCRIPTS:Ljava/lang/String; = "https://www.googleapis.com/auth/drive.scripts"


# direct methods
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

.method public static all()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/HashSet;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 6
    .line 7
    const-string v1, "https://www.googleapis.com/auth/drive"

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    const-string v1, "https://www.googleapis.com/auth/drive.appdata"

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    const-string v1, "https://www.googleapis.com/auth/drive.file"

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    const-string v1, "https://www.googleapis.com/auth/drive.metadata"

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    const-string v1, "https://www.googleapis.com/auth/drive.metadata.readonly"

    .line 28
    .line 29
    .line 30
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    const-string v1, "https://www.googleapis.com/auth/drive.photos.readonly"

    .line 33
    .line 34
    .line 35
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    const-string v1, "https://www.googleapis.com/auth/drive.readonly"

    .line 38
    .line 39
    .line 40
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    const-string v1, "https://www.googleapis.com/auth/drive.scripts"

    .line 43
    .line 44
    .line 45
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 49
    move-result-object v0

    .line 50
    return-object v0
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
