package com.kubi.sdk.pkg.bundle.i18n;

import com.google.firebase.remoteconfig.RemoteConfigComponent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: PackageRnI18nFetcher.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.pkg.bundle.i18n.PackageRnI18nFetcher", m90122f = "PackageRnI18nFetcher.kt", m90123i = {0}, m90124l = {11}, m90125m = RemoteConfigComponent.FETCH_FILE_NAME, m90126n = {"validator"}, m90127s = {"L$0"})
public final class PackageRnI18nFetcher$fetch$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PackageRnI18nFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PackageRnI18nFetcher$fetch$1(PackageRnI18nFetcher packageRnI18nFetcher, Continuation<? super PackageRnI18nFetcher$fetch$1> continuation) {
        super(continuation);
        this.this$0 = packageRnI18nFetcher;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo57549a(null, null, this);
    }
}
