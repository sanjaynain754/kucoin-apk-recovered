package io.reactivex.rxkotlin;

import io.reactivex.functions.Consumer;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: subscribers.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90082bv = {1, 0, 2}, m90085k = 3, m90086mv = {1, 1, 11})
final class SubscribersKt$sam$io_reactivex_functions_Consumer$0 implements Consumer {
    private final /* synthetic */ Function1 function;

    @Override // io.reactivex.functions.Consumer
    public final /* synthetic */ void accept(Object obj) {
        Intrinsics.checkExpressionValueIsNotNull(this.function.invoke(obj), "invoke(...)");
    }

    public SubscribersKt$sam$io_reactivex_functions_Consumer$0(Function1 function1) {
        this.function = function1;
    }
}
