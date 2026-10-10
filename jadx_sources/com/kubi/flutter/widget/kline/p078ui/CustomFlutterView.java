package com.kubi.flutter.widget.kline.p078ui;

import android.content.Context;
import android.os.Build;
import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillValue;
import io.flutter.embedding.android.FlutterTextureView;
import io.flutter.embedding.android.FlutterView;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CustomFlutterView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00072\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eH\u0016¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/ui/CustomFlutterView;", "Lio/flutter/embedding/android/FlutterView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "onProvideAutofillVirtualStructure", "", "structure", "Landroid/view/ViewStructure;", "flags", "", "autofill", "values", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CustomFlutterView extends FlutterView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomFlutterView(@NotNull Context context) {
        super(context, new FlutterTextureView(context));
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(2);
        }
    }

    @Override // io.flutter.embedding.android.FlutterView, android.view.View
    public void autofill(@NotNull SparseArray<AutofillValue> values) {
        Intrinsics.checkNotNullParameter(values, "values");
        try {
            super.autofill(values);
        } catch (Throwable unused) {
        }
    }

    @Override // io.flutter.embedding.android.FlutterView, android.view.View
    public void onProvideAutofillVirtualStructure(@NotNull ViewStructure structure, int flags) {
        Intrinsics.checkNotNullParameter(structure, "structure");
        try {
            super.onProvideAutofillVirtualStructure(structure, flags);
        } catch (Throwable unused) {
        }
    }
}
