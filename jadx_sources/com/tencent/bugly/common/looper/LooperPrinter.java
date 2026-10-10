package com.tencent.bugly.common.looper;

import android.util.Printer;
import com.tencent.rmonitor.common.logger.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0002\u0010\u0011B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, m90084d2 = {"Lcom/tencent/bugly/common/looper/LooperPrinter;", "Landroid/util/Printer;", "origin", "dispatch", "Lcom/tencent/bugly/common/looper/LooperPrinter$IDispatch;", "(Landroid/util/Printer;Lcom/tencent/bugly/common/looper/LooperPrinter$IDispatch;)V", "callingOrigin", "", "isHasChecked", "isValid", "getOrigin", "()Landroid/util/Printer;", "println", "", "x", "", "Companion", "IDispatch", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class LooperPrinter implements Printer {

    @NotNull
    private static final String START_PREFIX = ">>";

    @NotNull
    private static final String STOP_PREFIX = "<<";

    @NotNull
    private static final String TAG = "RMonitor_looper_Printer";
    private boolean callingOrigin;

    @NotNull
    private final IDispatch dispatch;
    private boolean isHasChecked;
    private boolean isValid;

    @Nullable
    private final Printer origin;

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, m90084d2 = {"Lcom/tencent/bugly/common/looper/LooperPrinter$IDispatch;", "", "checkValid", "", "printer", "Landroid/util/Printer;", "dispatch", "", "isBegin", "log", "", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public interface IDispatch {
        boolean checkValid(@NotNull Printer printer);

        void dispatch(boolean isBegin, @NotNull String log);
    }

    public LooperPrinter(@Nullable Printer printer, @NotNull IDispatch dispatch) {
        Intrinsics.checkNotNullParameter(dispatch, "dispatch");
        this.origin = printer;
        this.dispatch = dispatch;
    }

    @Nullable
    public final Printer getOrigin() {
        return this.origin;
    }

    @Override // android.util.Printer
    public void println(@NotNull String x11) {
        boolean z11;
        Printer printer;
        Intrinsics.checkNotNullParameter(x11, "x");
        if (this.dispatch.checkValid(this)) {
            if (!this.callingOrigin && (printer = this.origin) != null && printer != this && !(printer instanceof LooperPrinter)) {
                this.callingOrigin = true;
                printer.println(x11);
                this.callingOrigin = false;
            }
            if (!this.isHasChecked) {
                if (!StringsKt.startsWith$default(x11, START_PREFIX, false, 2, (Object) null) && !StringsKt.startsWith$default(x11, STOP_PREFIX, false, 2, (Object) null)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                this.isValid = z11;
                this.isHasChecked = true;
                Logger.INSTANCE.mo77130d(TAG, "println, isValid: " + this.isValid + ", x: " + x11);
            }
            if (this.isValid) {
                this.dispatch.dispatch(StringsKt.startsWith$default(x11, START_PREFIX, false, 2, (Object) null), x11);
            }
        }
    }
}
