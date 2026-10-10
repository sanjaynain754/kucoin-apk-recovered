package androidx.core.view;

import android.view.ViewParent;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
public /* synthetic */ class ViewKt$ancestors$1 extends FunctionReferenceImpl implements Function1<ViewParent, ViewParent> {
    public static final ViewKt$ancestors$1 INSTANCE = new ViewKt$ancestors$1();

    @Override // p852kotlin.jvm.functions.Function1
    public final ViewParent invoke(ViewParent viewParent) {
        return viewParent.getParent();
    }

    public ViewKt$ancestors$1() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }
}
