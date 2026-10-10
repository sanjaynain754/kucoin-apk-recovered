package com.kubi.futures.compliance.leverage;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.Transformations;
import com.kubi.sdk.util.C24252m0;
import com.tencent.bugly.proguard.C33675gh;
import com.tencent.qcloud.tuicore.TUIConstants;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.futures.compliance.leverage.i0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: EuropeUnlockLeverageFillOrderEvent.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nJ\u0006\u0010\u000e\u001a\u00020\fJ\u001c\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0013J\u0006\u0010\u0014\u001a\u00020\fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/futures/compliance/leverage/EuropeUnlockLeverageProcessor;", "", "<init>", "()V", "job", "Lkotlinx/coroutines/Job;", "behavior", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/futures/compliance/leverage/IEuropeUnlockLeverageFillOrderEvent;", "value", "Lcom/kubi/futures/compliance/leverage/EuropeUnlockLeverageFillOrderEvent;", C33675gh.f70005k, "", "event", "sendEmpty", "observe", TUIConstants.TUIChat.OWNER, "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "onClear", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class EuropeUnlockLeverageProcessor {

    /* JADX INFO: renamed from: b */
    @Nullable
    public static InterfaceC41775x1 f22644b;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final EuropeUnlockLeverageProcessor f22643a = new EuropeUnlockLeverageProcessor();

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final MutableLiveData<IEuropeUnlockLeverageFillOrderEvent> f22645c = new MutableLiveData<>();

    /* JADX INFO: renamed from: d */
    public static final boolean m24696d(IEuropeUnlockLeverageFillOrderEvent iEuropeUnlockLeverageFillOrderEvent) {
        return iEuropeUnlockLeverageFillOrderEvent instanceof EuropeUnlockLeverageFillOrderEvent;
    }

    /* JADX INFO: renamed from: e */
    public static final EuropeUnlockLeverageFillOrderEvent m24697e(IEuropeUnlockLeverageFillOrderEvent iEuropeUnlockLeverageFillOrderEvent) {
        Intrinsics.checkNotNull(iEuropeUnlockLeverageFillOrderEvent, "null cannot be cast to non-null type com.kubi.futures.compliance.leverage.EuropeUnlockLeverageFillOrderEvent");
        return (EuropeUnlockLeverageFillOrderEvent) iEuropeUnlockLeverageFillOrderEvent;
    }

    /* JADX INFO: renamed from: c */
    public final void m24698c(@NotNull LifecycleOwner owner, @NotNull Observer<EuropeUnlockLeverageFillOrderEvent> observer) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(observer, "observer");
        Transformations.map(C24252m0.m58481q(f22645c, new Function1() { // from class: com.kubi.futures.compliance.leverage.g0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(EuropeUnlockLeverageProcessor.m24696d((IEuropeUnlockLeverageFillOrderEvent) obj));
            }
        }), new Function1() { // from class: com.kubi.futures.compliance.leverage.h0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EuropeUnlockLeverageProcessor.m24697e((IEuropeUnlockLeverageFillOrderEvent) obj);
            }
        }).observe(owner, observer);
    }

    /* JADX INFO: renamed from: f */
    public final void m24699f() {
        f22645c.setValue(new EuropeUnlockLeverageFillEmptyEvent());
    }

    /* JADX INFO: renamed from: g */
    public final void m24700g(@NotNull EuropeUnlockLeverageFillOrderEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        f22645c.setValue(event);
        InterfaceC41775x1 interfaceC41775x1 = f22644b;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m24701h() {
        f22645c.postValue(new EuropeUnlockLeverageFillEmptyEvent());
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final EuropeUnlockLeverageFillOrderEvent m24702i() {
        IEuropeUnlockLeverageFillOrderEvent value = f22645c.getValue();
        if (value instanceof EuropeUnlockLeverageFillOrderEvent) {
            return (EuropeUnlockLeverageFillOrderEvent) value;
        }
        return null;
    }
}
