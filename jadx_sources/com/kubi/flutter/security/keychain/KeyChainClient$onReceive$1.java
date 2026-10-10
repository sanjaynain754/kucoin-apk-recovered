package com.kubi.flutter.security.keychain;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: KeyChainClient.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.flutter.security.keychain.KeyChainClient", m90122f = "KeyChainClient.kt", m90123i = {1, 1, 3, 3, 5, 5, 7, 7, 9, 9, 11, 11, 13, 13, 15, 15}, m90124l = {39, 43, 44, 48, 49, 53, 54, 58, 59, 63, 64, 68, 69, 73, 74, 78}, m90125m = "onReceive", m90126n = {"this", "arguments", "this", "arguments", "this", "arguments", "this", "arguments", "this", "arguments", "this", "arguments", "this", "arguments", "this", "arguments"}, m90127s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
public final class KeyChainClient$onReceive$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ KeyChainClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyChainClient$onReceive$1(KeyChainClient keyChainClient, Continuation<? super KeyChainClient$onReceive$1> continuation) {
        super(continuation);
        this.this$0 = keyChainClient;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo24073e(null, null, this);
    }
}
