.class public interface abstract Ls7/a;
.super Ljava/lang/Object;


# virtual methods
.method public abstract a()Lr7/a;
.end method

.method public abstract b(Lcom/forter/mobile/fortersdk/models/TrackType;)Z
    .param p1    # Lcom/forter/mobile/fortersdk/models/TrackType;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract c(Z)Z
.end method

.method public abstract d(Lcom/forter/mobile/fortersdk/models/NavigationType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .param p1    # Lcom/forter/mobile/fortersdk/models/NavigationType;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract e(Landroid/app/Application;Ljava/lang/String;Ljava/lang/String;)V
    .param p1    # Landroid/app/Application;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract f(Lcom/forter/mobile/fortersdk/models/TrackType;Ljava/lang/String;)Z
    .param p1    # Lcom/forter/mobile/fortersdk/models/TrackType;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract onLocationChanged(Landroid/location/Location;)V
    .param p1    # Landroid/location/Location;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method
