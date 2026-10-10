package io.reactivex.rxkotlin;

import io.reactivex.functions.Action;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: subscribers.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90082bv = {1, 0, 2}, m90085k = 3, m90086mv = {1, 1, 11})
final class SubscribersKt$sam$io_reactivex_functions_Action$0 implements Action {
    private final /* synthetic */ Function0 function;

    @Override // io.reactivex.functions.Action
    public final /* synthetic */ void run() {
        Intrinsics.checkExpressionValueIsNotNull(this.function.invoke(), "invoke(...)");
    }

    public SubscribersKt$sam$io_reactivex_functions_Action$0(Function0 function0) {
        this.function = function0;
    }
}
