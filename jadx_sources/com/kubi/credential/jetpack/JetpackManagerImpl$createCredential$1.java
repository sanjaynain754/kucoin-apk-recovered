package com.kubi.credential.jetpack;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: JetpackManagerImpl.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.credential.jetpack.JetpackManagerImpl", m90122f = "JetpackManagerImpl.kt", m90123i = {}, m90124l = {28}, m90125m = "createCredential", m90126n = {}, m90127s = {})
public final class JetpackManagerImpl$createCredential$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ JetpackManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JetpackManagerImpl$createCredential$1(JetpackManagerImpl jetpackManagerImpl, Continuation<? super JetpackManagerImpl$createCredential$1> continuation) {
        super(continuation);
        this.this$0 = jetpackManagerImpl;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo23421a(null, null, this);
    }
}
