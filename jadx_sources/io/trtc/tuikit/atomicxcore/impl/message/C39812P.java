package io.trtc.tuikit.atomicxcore.impl.message;

import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Lambda;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.message.P */
/* JADX INFO: loaded from: classes61.dex */
public final class C39812P extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Ref.BooleanRef f88464a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39812P(Ref.BooleanRef booleanRef) {
        super(1);
        this.f88464a = booleanRef;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f88464a.element = ((Boolean) obj).booleanValue();
        return Unit.INSTANCE;
    }
}
