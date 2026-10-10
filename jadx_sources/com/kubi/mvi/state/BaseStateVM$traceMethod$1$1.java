package com.kubi.mvi.state;

import androidx.exifinterface.media.ExifInterface;
import org.json.JSONException;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Lambda;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BaseStateVM.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m90084d2 = {"Lcom/kubi/mvi/state/d;", "I", "Lcom/kubi/mvi/state/f;", ExifInterface.LATITUDE_SOUTH, "", "invoke", "()V", "<anonymous>"}, m90085k = 3, m90086mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nBaseStateVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseStateVM.kt\ncom/kubi/mvi/state/BaseStateVM$traceMethod$1$1\n*L\n1#1,630:1\n*E\n"})
public final class BaseStateVM$traceMethod$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ String $methodName;
    final /* synthetic */ BaseStateVM<I, S> this$0;

    @Override // p852kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
        invoke2();
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseStateVM$traceMethod$1$1(BaseStateVM<I, S> baseStateVM, String str) {
        super(0);
        this.this$0 = baseStateVM;
        this.$methodName = str;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() throws JSONException {
        MVITracker.INSTANCE.trackStartHandleIntent(this.this$0.getBiz(), this.$methodName);
    }
}
