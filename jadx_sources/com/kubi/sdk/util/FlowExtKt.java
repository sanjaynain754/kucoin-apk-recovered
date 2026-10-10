package com.kubi.sdk.util;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FlowExt.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003¨\u0006\u0004"}, m90084d2 = {"asSafeLiveData", "Landroidx/lifecycle/LiveData;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/Flow;", "LBase_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FlowExtKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> LiveData<T> m58321a(@NotNull InterfaceC41634e<? extends T> interfaceC41634e) {
        Intrinsics.checkNotNullParameter(interfaceC41634e, "<this>");
        return FlowLiveDataConversions.asLiveData$default(C41636g.m90917h(interfaceC41634e, new FlowExtKt$asSafeLiveData$1(null)), (CoroutineContext) null, 0L, 3, (Object) null);
    }
}
