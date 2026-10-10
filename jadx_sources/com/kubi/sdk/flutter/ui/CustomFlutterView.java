package com.kubi.sdk.flutter.ui;

import android.content.Context;
import android.os.Build;
import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillValue;
import io.flutter.embedding.android.FlutterSurfaceView;
import io.flutter.embedding.android.FlutterTextureView;
import io.flutter.embedding.android.FlutterView;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: CustomFlutterView.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\f2\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013H\u0016¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/sdk/flutter/ui/CustomFlutterView;", "Lio/flutter/embedding/android/FlutterView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "mode", "Lcom/kubi/sdk/flutter/ui/FlutterMode$Surface;", "(Landroid/content/Context;Lcom/kubi/sdk/flutter/ui/FlutterMode$Surface;)V", "Lcom/kubi/sdk/flutter/ui/FlutterMode$Texture;", "(Landroid/content/Context;Lcom/kubi/sdk/flutter/ui/FlutterMode$Texture;)V", "onProvideAutofillVirtualStructure", "", "structure", "Landroid/view/ViewStructure;", "flags", "", "autofill", "values", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CustomFlutterView extends FlutterView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomFlutterView(@NotNull Context context) {
        this(context, FlutterMode.a.f46781a);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomFlutterView(@NotNull Context context, @NotNull FlutterMode.a mode) {
        super(context, new FlutterSurfaceView(context));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mode, "mode");
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(2);
        }
        C44128b.m97259c("TVDiag", "CustomFlutterView created mode=Surface (FlutterSurfaceView)");
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomFlutterView(@NotNull Context context, @NotNull FlutterMode.b mode) {
        super(context, new FlutterTextureView(context));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mode, "mode");
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(2);
        }
        C44128b.m97259c("TVDiag", "CustomFlutterView created mode=Texture (FlutterTextureView)");
    }
}
