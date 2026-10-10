package wa0;

import android.content.Context;
import android.widget.TextView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import xa0.InterfaceC46115a;
import za0.C46742a;
import za0.C46743b;

/* JADX INFO: renamed from: wa0.d */
/* JADX INFO: loaded from: classes59.dex */
public final class C45783d {
    /* JADX INFO: renamed from: a */
    public static final void m101108a(@NotNull TextView textView, @Nullable InterfaceC46115a interfaceC46115a, @Nullable Function1<? super C46743b, Unit> function1) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        C45784e.m101111b(textView, interfaceC46115a != null);
        if (interfaceC46115a != null) {
            Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            new C46742a(context).m102997e(interfaceC46115a, textView, function1);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m101109b(TextView textView, InterfaceC46115a interfaceC46115a, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        m101108a(textView, interfaceC46115a, function1);
    }
}
