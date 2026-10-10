package com.kubi.mvi.state;

import androidx.exifinterface.media.ExifInterface;
import org.json.JSONException;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Lambda;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BaseStateVM.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m90084d2 = {"Lcom/kubi/mvi/state/d;", "I", "Lcom/kubi/mvi/state/f;", ExifInterface.LATITUDE_SOUTH, "", "it", "", "invoke", "(J)V", "<anonymous>"}, m90085k = 3, m90086mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nBaseStateVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseStateVM.kt\ncom/kubi/mvi/state/BaseStateVM$traceMethod$1$3\n*L\n1#1,630:1\n*E\n"})
public final class BaseStateVM$traceMethod$1$3 extends Lambda implements Function1<Long, Unit> {
    final /* synthetic */ String $methodName;
    final /* synthetic */ BaseStateVM<I, S> this$0;

    @Override // p852kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Long l11) throws JSONException {
        invoke(l11.longValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseStateVM$traceMethod$1$3(BaseStateVM<I, S> baseStateVM, String str) {
        super(1);
        this.this$0 = baseStateVM;
        this.$methodName = str;
    }

    public final void invoke(long j11) throws JSONException {
        MVITracker.Companion.trackEndHandleIntent$default(MVITracker.INSTANCE, this.this$0.getBiz(), this.$methodName, j11, null, 8, null);
    }
}
