.class public final Landroidx/camera/video/FileOutputOptions;
.super Landroidx/camera/video/OutputOptions;
.source "FileOutputOptions.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/video/FileOutputOptions$FileOutputOptionsInternal;,
        Landroidx/camera/video/FileOutputOptions$Builder;
    }
.end annotation


# instance fields
.field private final mFileOutputOptionsInternal:Landroidx/camera/video/FileOutputOptions$FileOutputOptionsInternal;


# direct methods
.method public constructor <init>(Landroidx/camera/video/FileOutputOptions$FileOutputOptionsInternal;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroidx/camera/video/OutputOptions;-><init>(Landroidx/camera/video/OutputOptions$OutputOptionsInternal;)V

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/camera/video/FileOutputOptions;->mFileOutputOptionsInternal:Landroidx/camera/video/FileOutputOptions$FileOutputOptionsInternal;

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


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    .line 6
    :cond_0
    instance-of v0, p1, Landroidx/camera/video/FileOutputOptions;

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    .line 12
    :cond_1
    iget-object v0, p0, Landroidx/camera/video/FileOutputOptions;->mFileOutputOptionsInternal:Landroidx/camera/video/FileOutputOptions$FileOutputOptionsInternal;

    .line 13
    .line 14
    check-cast p1, Landroidx/camera/video/FileOutputOptions;

    .line 15
    .line 16
    iget-object p1, p1, Landroidx/camera/video/FileOutputOptions;->mFileOutputOptionsInternal:Landroidx/camera/video/FileOutputOptions$FileOutputOptionsInternal;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    move-result p1

    .line 21
    return p1
    .line 22
    .line 23
    .line 24
.end method

.method public getFile()Ljava/io/File;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/video/FileOutputOptions;->mFileOutputOptionsInternal:Landroidx/camera/video/FileOutputOptions$FileOutputOptionsInternal;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/camera/video/FileOutputOptions$FileOutputOptionsInternal;->getFile()Ljava/io/File;

    .line 6
    move-result-object v0

    .line 7
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

.method public hashCode()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/video/FileOutputOptions;->mFileOutputOptionsInternal:Landroidx/camera/video/FileOutputOptions$FileOutputOptionsInternal;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

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

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/video/FileOutputOptions;->mFileOutputOptionsInternal:Landroidx/camera/video/FileOutputOptions$FileOutputOptionsInternal;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    const-string v1, "FileOutputOptionsInternal"

    .line 9
    .line 10
    const-string v2, "FileOutputOptions"

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    move-result-object v0

    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method
