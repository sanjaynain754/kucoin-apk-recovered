package androidx.core.view.contentcapture;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewStructureCompat;
import androidx.core.view.autofill.AutofillIdCompat;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
public class ContentCaptureSessionCompat {
    private static final String KEY_VIEW_TREE_APPEARED = "TREAT_AS_VIEW_TREE_APPEARED";
    private static final String KEY_VIEW_TREE_APPEARING = "TREAT_AS_VIEW_TREE_APPEARING";
    private final View mView;
    private final Object mWrappedObj;

    @RequiresApi(23)
    public static class Api23Impl {
        private Api23Impl() {
        }

        public static Bundle getExtras(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }
    }

    @RequiresApi(29)
    public static class Api29Impl {
        private Api29Impl() {
        }

        public static AutofillId newAutofillId(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j11) {
            return contentCaptureSession.newAutofillId(autofillId, j11);
        }

        public static ViewStructure newViewStructure(ContentCaptureSession contentCaptureSession, View view) {
            return contentCaptureSession.newViewStructure(view);
        }

        public static ViewStructure newVirtualViewStructure(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j11) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j11);
        }

        public static void notifyViewAppeared(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        public static void notifyViewTextChanged(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }

        public static void notifyViewsDisappeared(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }
    }

    @RequiresApi(34)
    public static class Api34Impl {
        private Api34Impl() {
        }

        public static void notifyViewsAppeared(ContentCaptureSession contentCaptureSession, List<ViewStructure> list) {
            contentCaptureSession.notifyViewsAppeared(list);
        }
    }

    @NonNull
    @RequiresApi(29)
    public static ContentCaptureSessionCompat toContentCaptureSessionCompat(@NonNull ContentCaptureSession contentCaptureSession, @NonNull View view) {
        return new ContentCaptureSessionCompat(contentCaptureSession, view);
    }

    @Nullable
    public AutofillId newAutofillId(long j11) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionM2538a = C1854a.m2538a(this.mWrappedObj);
        AutofillIdCompat autofillId = ViewCompat.getAutofillId(this.mView);
        Objects.requireNonNull(autofillId);
        return Api29Impl.newAutofillId(contentCaptureSessionM2538a, autofillId.toAutofillId(), j11);
    }

    @Nullable
    public ViewStructureCompat newVirtualViewStructure(@NonNull AutofillId autofillId, long j11) {
        if (Build.VERSION.SDK_INT >= 29) {
            return ViewStructureCompat.toViewStructureCompat(Api29Impl.newVirtualViewStructure(C1854a.m2538a(this.mWrappedObj), autofillId, j11));
        }
        return null;
    }

    public void notifyViewTextChanged(@NonNull AutofillId autofillId, @Nullable CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.notifyViewTextChanged(C1854a.m2538a(this.mWrappedObj), autofillId, charSequence);
        }
    }

    public void notifyViewsAppeared(@NonNull List<ViewStructure> list) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            Api34Impl.notifyViewsAppeared(C1854a.m2538a(this.mWrappedObj), list);
            return;
        }
        if (i11 >= 29) {
            ViewStructure viewStructureNewViewStructure = Api29Impl.newViewStructure(C1854a.m2538a(this.mWrappedObj), this.mView);
            Api23Impl.getExtras(viewStructureNewViewStructure).putBoolean(KEY_VIEW_TREE_APPEARING, true);
            Api29Impl.notifyViewAppeared(C1854a.m2538a(this.mWrappedObj), viewStructureNewViewStructure);
            for (int i12 = 0; i12 < list.size(); i12++) {
                Api29Impl.notifyViewAppeared(C1854a.m2538a(this.mWrappedObj), list.get(i12));
            }
            ViewStructure viewStructureNewViewStructure2 = Api29Impl.newViewStructure(C1854a.m2538a(this.mWrappedObj), this.mView);
            Api23Impl.getExtras(viewStructureNewViewStructure2).putBoolean(KEY_VIEW_TREE_APPEARED, true);
            Api29Impl.notifyViewAppeared(C1854a.m2538a(this.mWrappedObj), viewStructureNewViewStructure2);
        }
    }

    public void notifyViewsDisappeared(@NonNull long[] jArr) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            ContentCaptureSession contentCaptureSessionM2538a = C1854a.m2538a(this.mWrappedObj);
            AutofillIdCompat autofillId = ViewCompat.getAutofillId(this.mView);
            Objects.requireNonNull(autofillId);
            Api29Impl.notifyViewsDisappeared(contentCaptureSessionM2538a, autofillId.toAutofillId(), jArr);
            return;
        }
        if (i11 >= 29) {
            ViewStructure viewStructureNewViewStructure = Api29Impl.newViewStructure(C1854a.m2538a(this.mWrappedObj), this.mView);
            Api23Impl.getExtras(viewStructureNewViewStructure).putBoolean(KEY_VIEW_TREE_APPEARING, true);
            Api29Impl.notifyViewAppeared(C1854a.m2538a(this.mWrappedObj), viewStructureNewViewStructure);
            ContentCaptureSession contentCaptureSessionM2538a2 = C1854a.m2538a(this.mWrappedObj);
            AutofillIdCompat autofillId2 = ViewCompat.getAutofillId(this.mView);
            Objects.requireNonNull(autofillId2);
            Api29Impl.notifyViewsDisappeared(contentCaptureSessionM2538a2, autofillId2.toAutofillId(), jArr);
            ViewStructure viewStructureNewViewStructure2 = Api29Impl.newViewStructure(C1854a.m2538a(this.mWrappedObj), this.mView);
            Api23Impl.getExtras(viewStructureNewViewStructure2).putBoolean(KEY_VIEW_TREE_APPEARED, true);
            Api29Impl.notifyViewAppeared(C1854a.m2538a(this.mWrappedObj), viewStructureNewViewStructure2);
        }
    }

    @NonNull
    @RequiresApi(29)
    public ContentCaptureSession toContentCaptureSession() {
        return C1854a.m2538a(this.mWrappedObj);
    }

    @RequiresApi(29)
    private ContentCaptureSessionCompat(@NonNull ContentCaptureSession contentCaptureSession, @NonNull View view) {
        this.mWrappedObj = contentCaptureSession;
        this.mView = view;
    }
}
