package androidx.lifecycle;

import android.app.Application;
import androidx.media3.common.MimeTypes;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidViewModel.android.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m90084d2 = {MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "Landroidx/lifecycle/AndroidViewModel;", "getApplication", "(Landroidx/lifecycle/AndroidViewModel;)Landroid/app/Application;", "lifecycle-viewmodel_release"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class AndroidViewModel_androidKt {
    @NotNull
    public static final Application getApplication(@NotNull AndroidViewModel androidViewModel) {
        Intrinsics.checkNotNullParameter(androidViewModel, "<this>");
        return androidViewModel.getApplication();
    }
}
