package androidx.core.os;

import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: Handler.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m90084d2 = {"<anonymous>", "", "run"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 176)
public final class HandlerKt$postDelayed$runnable$1 implements Runnable {
    final /* synthetic */ Function0<Unit> $action;

    public HandlerKt$postDelayed$runnable$1(Function0<Unit> function0) {
        this.$action = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.$action.invoke();
    }
}
