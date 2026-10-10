package com.kubi.sdk.viewbindingdelegate.internal;

import android.os.Looper;
import androidx.annotation.RestrictTo;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.viewbinding.ViewBinding;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u001a%\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u000f\u0010\u0006\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\b\u001a\u0004\b\t\u0010\u0005¨\u0006\u000b"}, m90084d2 = {"Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function1;", "", "b", "()Lkotlin/jvm/functions/Function1;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()V", "Lkotlin/jvm/functions/Function1;", "getEMPTY_VB_CALLBACK", "EMPTY_VB_CALLBACK", "sdk_release"}, m90085k = 2, m90086mv = {1, 6, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class UtilsKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Function1<ViewBinding, Unit> f48316a = new Function1<ViewBinding, Unit>() { // from class: com.kubi.sdk.viewbindingdelegate.internal.UtilsKt$EMPTY_VB_CALLBACK$1
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull ViewBinding noName_0) {
            Intrinsics.checkNotNullParameter(noName_0, "$noName_0");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ViewBinding viewBinding) {
            invoke2(viewBinding);
            return Unit.INSTANCE;
        }
    };

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T extends ViewBinding> Function1<T, Unit> m58554b() {
        return (Function1<T, Unit>) f48316a;
    }

    /* JADX INFO: renamed from: a */
    public static final void m58553a() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
        } else {
            throw new IllegalStateException("The method must be called on the main thread");
        }
    }
}
