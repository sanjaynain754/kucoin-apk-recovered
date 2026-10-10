package com.kubi.launch;

import com.tencent.bugly.proguard.InterfaceC33617e1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Launcher.kt */
/* JADX INFO: loaded from: classes22.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.launch.TimPushLauncher", m90122f = "Launcher.kt", m90123i = {0, 1}, m90124l = {156, 162}, m90125m = InterfaceC33617e1.f69659h, m90126n = {"context", "context"}, m90127s = {"L$0", "L$0"})
public final class TimPushLauncher$launch$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TimPushLauncher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimPushLauncher$launch$1(TimPushLauncher timPushLauncher, Continuation<? super TimPushLauncher$launch$1> continuation) {
        super(continuation);
        this.this$0 = timPushLauncher;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo37438b(null, this);
    }
}
