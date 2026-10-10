.class public interface abstract Ll1/c;
.super Ljava/lang/Object;
.source "LottieFetchResult.java"

# interfaces
.implements Ljava/io/Closeable;


# virtual methods
.method public abstract A()Ljava/lang/String;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end method

.method public abstract B()Ljava/io/InputStream;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract error()Ljava/lang/String;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end method

.method public abstract isSuccessful()Z
.end method
