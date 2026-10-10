.class public interface abstract annotation Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap$MapOptionalId;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/thumbplayer/tcmedia/adapter/strategy/utils/TPNativeKeyMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2609
    name = "MapOptionalId"
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->RUNTIME:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->FIELD:Ljava/lang/annotation/ElementType;
    }
.end annotation


# virtual methods
.method public abstract keyName()Ljava/lang/String;
.end method

.method public abstract type()I
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$OptionalIdType;
    .end annotation
.end method

.method public abstract value()I
    .annotation runtime Lcom/tencent/thumbplayer/tcmedia/api/TPCommonEnum$NativeOptionalId;
    .end annotation
.end method
