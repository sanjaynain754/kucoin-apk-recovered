package com.kubi.network.subscribe.period;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: OnetimeExecutor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
public /* synthetic */ class OnetimeExecutor$process$body$1 extends FunctionReferenceImpl implements Function2<Object, Boolean, String> {
    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ String invoke(Object obj, Boolean bool) {
        return invoke(obj, bool.booleanValue());
    }

    public OnetimeExecutor$process$body$1(Object obj) {
        super(2, obj, OnetimeExecutor.class, "parseData", "parseData(Ljava/lang/Object;Z)Ljava/lang/String;", 0);
    }

    @NotNull
    public final String invoke(@Nullable Object obj, boolean z11) {
        return ((OnetimeExecutor) this.receiver).m43083f(obj, z11);
    }
}
