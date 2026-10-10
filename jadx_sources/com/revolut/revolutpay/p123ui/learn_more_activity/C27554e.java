package com.revolut.revolutpay.p123ui.learn_more_activity;

import androidx.core.view.ViewCompat;
import com.revolut.revolutpay.R$string;
import com.revolut.revolutpay.p123ui.navigator.internal.C27557c;
import com.revolut.revolutpay.ui_kit.delegate.C27591a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import pa0.C43428b;
import qa0.C43680e;
import sa0.AbstractC44371a;
import xa0.C46121g;
import xa0.C46122h;
import xa0.InterfaceC46115a;
import za0.C46743b;

/* JADX INFO: renamed from: com.revolut.revolutpay.ui.learn_more_activity.e */
/* JADX INFO: loaded from: classes59.dex */
public final class C27554e extends AbstractC44371a<InterfaceC27553d> implements InterfaceC27552c {

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final a f56274f = new a(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public final C43428b f56275c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final C43680e f56276d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final LearnMoreActivity.C27547a f56277e;

    /* JADX INFO: renamed from: com.revolut.revolutpay.ui.learn_more_activity.e$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.revolut.revolutpay.p123ui.learn_more_activity.InterfaceC27552c
    /* JADX INFO: renamed from: b */
    public void mo68336b(@NotNull C46743b clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        if (Intrinsics.areEqual(clickData.m102998a(), "terms_and_conditions")) {
            this.f56275c.m95616f(new C27557c(this.f56276d.m96140a("https://www.revolut.com/legal/pay-with-revolut-checkout/")));
        }
    }

    public C27554e(@NotNull C43428b navigator, @NotNull C43680e parser, @NotNull LearnMoreActivity.C27547a cashbackData) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(cashbackData, "cashbackData");
        this.f56275c = navigator;
        this.f56276d = parser;
        this.f56277e = cashbackData;
    }

    @Override // sa0.AbstractC44371a
    /* JADX INFO: renamed from: e */
    public void mo68337e() {
        int i11;
        InterfaceC27553d interfaceC27553dM97872d = m97872d();
        if (interfaceC27553dM97872d != null) {
            interfaceC27553dM97872d.mo68324v(new C46122h(R$string.revolut_upsell_widget_learn_more_title, CollectionsKt.listOf(this.f56277e.m68330d()), null, 4, null));
        }
        m68339g(1, new C46122h(R$string.revolut_upsell_widget_learn_more_step_one, null, null, 6, null));
        if (this.f56277e.m68332f()) {
            i11 = 2;
            m68339g(2, new C46122h(R$string.revolut_upsell_widget_learn_more_step_two, null, null, 6, null));
        } else {
            i11 = 1;
        }
        String strM68331e = this.f56277e.m68331e();
        if (strM68331e != null) {
            m68339g(i11 + 1, new C46122h(R$string.revolut_upsell_widget_learn_more_step_three, CollectionsKt.listOf(strM68331e), null, 4, null));
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m68339g(int i11, InterfaceC46115a interfaceC46115a) {
        InterfaceC27553d interfaceC27553dM97872d = m97872d();
        if (interfaceC27553dM97872d != null) {
            interfaceC27553dM97872d.mo68323s(new C27591a.b("LEARN_MOTE_STEP_" + i11, interfaceC46115a, null, new C27591a.a.C46986a(new C46121g(String.valueOf(i11), -1, ViewCompat.MEASURED_STATE_MASK, 0, 14, 24, 8, null)), null, 4, null));
        }
    }

    @Override // sa0.AbstractC44371a
    /* JADX INFO: renamed from: f */
    public void mo68338f() {
    }
}
