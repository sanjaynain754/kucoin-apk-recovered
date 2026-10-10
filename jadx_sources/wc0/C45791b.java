package wc0;

import android.view.View;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: wc0.b */
/* JADX INFO: compiled from: ViewExtend.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006\u001a(\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¨\u0006\b"}, m90084d2 = {"setDebounceClickListener", "", "Landroid/view/View;", JPushConstants.Geofence.KEY_INTERVAL, "", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function1;", "setDebounceClickListenerWithFeedback", "tuilivekit_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45791b {
    /* JADX INFO: renamed from: b */
    public static final void m101116b(@NotNull View view, final long j11, @NotNull final Function1<? super View, Unit> action) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        final Ref.LongRef longRef = new Ref.LongRef();
        view.setOnClickListener(new View.OnClickListener() { // from class: wc0.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C45791b.m101118d(longRef, j11, action, view2);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m101117c(View view, long j11, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 1000;
        }
        m101116b(view, j11, function1);
    }

    /* JADX INFO: renamed from: d */
    public static final void m101118d(Ref.LongRef longRef, long j11, Function1 function1, View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - longRef.element >= j11) {
            longRef.element = jCurrentTimeMillis;
            Intrinsics.checkNotNull(view);
            function1.invoke(view);
        }
    }
}
