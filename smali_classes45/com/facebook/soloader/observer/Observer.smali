.class public interface abstract Lcom/facebook/soloader/observer/Observer;
.super Ljava/lang/Object;
.source "Observer.java"


# virtual methods
.method public abstract onGetDependenciesEnd(Ljava/lang/Throwable;)V
.end method

.method public abstract onGetDependenciesStart()V
.end method

.method public abstract onLoadDependencyEnd(Ljava/lang/Throwable;Z)V
.end method

.method public abstract onLoadDependencyStart(Ljava/lang/String;I)V
.end method

.method public abstract onLoadLibraryEnd(Ljava/lang/Throwable;Z)V
.end method

.method public abstract onLoadLibraryStart(Ljava/lang/String;Ljava/lang/String;I)V
.end method

.method public abstract onRecoveryEnd(Ljava/lang/Throwable;)V
.end method

.method public abstract onRecoveryStart(Lcom/facebook/soloader/recovery/RecoveryStrategy;)V
.end method

.method public abstract onSoFileLoaderLoadEnd(Ljava/lang/Throwable;)V
.end method

.method public abstract onSoFileLoaderLoadStart(Lcom/facebook/soloader/SoFileLoader;Ljava/lang/String;I)V
.end method

.method public abstract onSoSourceLoadLibraryEnd(Ljava/lang/Throwable;)V
.end method

.method public abstract onSoSourceLoadLibraryStart(Lcom/facebook/soloader/SoSource;)V
.end method
