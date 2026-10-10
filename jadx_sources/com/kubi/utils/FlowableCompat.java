package com.kubi.utils;

import androidx.exifinterface.media.ExifInterface;
import com.sensorsdata.abtest.entity.AppConstants;
import io.reactivex.Flowable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FlowableCompat.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ'\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\f\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/utils/FlowableCompat;", "", "<init>", "()V", "Lkotlin/Function0;", "", "block", "Lio/reactivex/Flowable;", "c", "(Lkotlin/jvm/functions/Function0;)Lio/reactivex/Flowable;", ExifInterface.GPS_DIRECTION_TRUE, "callable", "b", "Ljava/lang/Object;", AppConstants.AB_TEST_SUCCESS, "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFlowableCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowableCompat.kt\ncom/kubi/utils/FlowableCompat\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
public final class FlowableCompat {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FlowableCompat f54248a = new FlowableCompat();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Object SUCCESS = new Object();

    @NotNull
    /* JADX INFO: renamed from: b */
    public final <T> Flowable<T> m66385b(@NotNull Function0<? extends T> callable) {
        Intrinsics.checkNotNullParameter(callable, "callable");
        return new CallableC27091t(callable);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Flowable<Object> m66386c(@NotNull final Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return m66385b(new Function0<Object>() { // from class: com.kubi.utils.FlowableCompat$fromRunnable$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Object invoke() {
                block.invoke();
                return FlowableCompat.SUCCESS;
            }
        });
    }
}
