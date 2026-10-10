package com.kubi.mvi.state;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.mvi.view.InterfaceC19301a;
import com.kubi.mvi.view.MviViewDelegate;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty1;

/* JADX INFO: compiled from: Status.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012 \u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0002B1\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\u0010\t\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJK\u0010\u0016\u001a\u00020\u0013\"\u0004\b\u0001\u0010\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f2\"\u0010\u0015\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0011¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u0019\u001a\u00020\u00132\"\u0010\u0015\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0011¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010\t\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, m90084d2 = {"Lcom/kubi/mvi/state/MviViewStatusDelegate;", ExifInterface.LATITUDE_SOUTH, "Lcom/kubi/mvi/view/MviViewDelegate;", "Lcom/kubi/mvi/state/d;", "Lcom/kubi/mvi/state/StatusState;", "Lcom/kubi/mvi/state/StatusVM;", "Lcom/kubi/mvi/state/MviConfig;", "config", "Lkotlin/reflect/KClass;", "vmClass", "Lcom/kubi/mvi/view/a;", "mviView", "<init>", "(Lcom/kubi/mvi/state/MviConfig;Lkotlin/reflect/KClass;Lcom/kubi/mvi/view/a;)V", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lkotlin/reflect/KProperty1;", "kProperty1", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", TUIConstants.TIMPush.NOTIFICATION.ACTION, ExifInterface.LONGITUDE_EAST, "(Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;)V", "Lcom/kubi/mvi/state/MVIStatus;", "F", "(Lkotlin/jvm/functions/Function2;)V", "f", "Lcom/kubi/mvi/state/MviConfig;", "g", "Lkotlin/reflect/KClass;", CmcdData.Factory.STREAMING_FORMAT_HLS, "Lcom/kubi/mvi/view/a;", "MVI_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final class MviViewStatusDelegate<S> extends MviViewDelegate<InterfaceC19282d, StatusState<S>, StatusVM<S>> {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final MviConfig config;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final KClass<? extends StatusVM<S>> vmClass;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC19301a mviView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MviViewStatusDelegate(@NotNull MviConfig config, @NotNull KClass<? extends StatusVM<S>> vmClass, @Nullable InterfaceC19301a interfaceC19301a) {
        super(config, vmClass, interfaceC19301a);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(vmClass, "vmClass");
        this.config = config;
        this.vmClass = vmClass;
        this.mviView = interfaceC19301a;
    }

    /* JADX INFO: renamed from: E */
    public final <A> void m42577E(@NotNull KProperty1<S, ? extends A> kProperty1, @NotNull Function2<? super A, ? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(kProperty1, "kProperty1");
        Intrinsics.checkNotNullParameter(action, "action");
        MviViewDelegate.m42703k(this, false, false, new MviViewStatusDelegate$bindData$1(this, kProperty1, action, null), 3, null);
    }

    /* JADX INFO: renamed from: F */
    public final void m42578F(@NotNull Function2<? super MVIStatus, ? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        MviViewDelegate.m42703k(this, false, false, new MviViewStatusDelegate$bindStatus$1(this, action, null), 3, null);
    }
}
