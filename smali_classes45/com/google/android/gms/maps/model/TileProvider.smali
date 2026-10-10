.class public interface abstract Lcom/google/android/gms/maps/model/TileProvider;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-maps@@18.0.0"


# static fields
.field public static final NO_TILE:Lcom/google/android/gms/maps/model/Tile;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/gms/maps/model/Tile;

    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, v1, v2}, Lcom/google/android/gms/maps/model/Tile;-><init>(II[B)V

    .line 8
    .line 9
    sput-object v0, Lcom/google/android/gms/maps/model/TileProvider;->NO_TILE:Lcom/google/android/gms/maps/model/Tile;

    .line 10
    return-void
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
.method public abstract getTile(III)Lcom/google/android/gms/maps/model/Tile;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end method
