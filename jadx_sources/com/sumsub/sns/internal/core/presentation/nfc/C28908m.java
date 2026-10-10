package com.sumsub.sns.internal.core.presentation.nfc;

import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import android.os.Bundle;
import com.sumsub.sns.internal.core.analytics.C28368g;
import com.sumsub.sns.internal.core.analytics.PrimaryAction;
import com.sumsub.sns.internal.core.analytics.PrimaryActionState;
import com.sumsub.sns.internal.core.presentation.common.AbstractC28787t;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.C31832F;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.nfc.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28908m extends AbstractC28787t {

    /* JADX INFO: renamed from: e */
    public final String f58786e;

    /* JADX INFO: renamed from: f */
    public boolean f58787f;

    /* JADX INFO: renamed from: g */
    public final C28897b f58788g;

    /* JADX INFO: renamed from: h */
    public final Lazy f58789h;

    /* JADX INFO: renamed from: i */
    public final int f58790i;

    /* JADX INFO: renamed from: j */
    public final Bundle f58791j;

    /* JADX INFO: renamed from: k */
    public final NfcAdapter.ReaderCallback f58792k;

    /* JADX INFO: renamed from: l */
    public NfcAdapter f58793l;

    /* JADX INFO: renamed from: m */
    public boolean f58794m;

    public C28908m(C31832F c31832f, Function0 function0, Function0 function1) {
        super(c31832f, null);
        this.f58786e = "NfcRead";
        this.f58788g = new C28897b(this, new Function1() { // from class: com.sumsub.sns.internal.core.presentation.nfc.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C28908m.m69682a(this.f58798b, ((Boolean) obj).booleanValue());
            }
        }, function1);
        this.f58789h = LazyKt.lazy(function0);
        this.f58790i = 3;
        Bundle bundle = new Bundle();
        bundle.putInt("presence", 250);
        this.f58791j = bundle;
        this.f58792k = new NfcAdapter.ReaderCallback() { // from class: com.sumsub.sns.internal.core.presentation.nfc.r
            @Override // android.nfc.NfcAdapter.ReaderCallback
            public final void onTagDiscovered(Tag tag) {
                C28908m.m69683a(this.f58799a, tag);
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m69682a(C28908m c28908m, boolean z11) {
        c28908m.f58787f = z11;
        c28908m.m69686n();
        return Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: m */
    public final void mo69522m() {
        m69684a((NfcAdapter) null);
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: h */
    public final String mo69480h() {
        return this.f58786e;
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: l */
    public final void mo69495l() {
        m69605a((C28907l) this.f58789h.getValue(), new Function1() { // from class: com.sumsub.sns.internal.core.presentation.nfc.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C28908m.m69681a(this.f58800b, (InterfaceC28898c) obj);
            }
        });
        m69686n();
    }

    /* JADX INFO: renamed from: n */
    public final void m69686n() {
        NfcAdapter defaultAdapter;
        boolean z11 = this.f58794m;
        if (z11 && this.f58787f) {
            defaultAdapter = NfcAdapter.getDefaultAdapter(this.f58549a.requireContext());
        } else {
            if (z11 && !this.f58787f) {
                this.f58788g.mo69598p();
                Unit unit = Unit.INSTANCE;
            }
            defaultAdapter = null;
        }
        m69684a(defaultAdapter);
    }

    /* JADX INFO: renamed from: a */
    public static final void m69683a(C28908m c28908m, Tag tag) {
        String[] techList;
        c28908m.m69608b("Got NFC tag");
        if (tag == null || (techList = tag.getTechList()) == null || !ArraysKt.contains(techList, "android.nfc.tech.IsoDep")) {
            return;
        }
        IsoDep isoDep = IsoDep.get(tag);
        c28908m.m69608b("Got IsoDep tag");
        C28907l c28907l = (C28907l) c28908m.f58789h.getValue();
        InterfaceC41775x1 interfaceC41775x1 = c28907l.f58785l;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        c28907l.f58785l = null;
        int iM69678a = c28907l.m69678a() + 1;
        C28936t c28936t = c28907l.f58779f;
        KProperty[] kPropertyArr = C28907l.f58773m;
        KProperty kProperty = kPropertyArr[0];
        c28936t.f58834a.set(c28936t.f58835b, Integer.valueOf(iM69678a));
        C28368g c28368gM69264a = new C28368g().m69264a(PrimaryAction.NfcScan);
        c28368gM69264a.f57846b.add(PrimaryActionState.Started);
        Pair pairM90091to = TuplesKt.m90091to("attempt", Integer.valueOf(c28907l.m69678a()));
        Pair pairM90091to2 = TuplesKt.m90091to("reader", c28907l.f58777d);
        String str = c28907l.f58778e;
        c28368gM69264a.f57847c = MapsKt.toMap(ArraysKt.filterNotNull(new Pair[]{pairM90091to, pairM90091to2, str != null ? TuplesKt.m90091to("sessionId", str) : null}));
        c28368gM69264a.m69267a(false);
        C28936t c28936t2 = c28907l.f58782i;
        KProperty kProperty2 = kPropertyArr[3];
        c28936t2.f58834a.set(c28936t2.f58835b, 0);
        NfcReadController$ReadingStep nfcReadController$ReadingStep = NfcReadController$ReadingStep.READING;
        C28936t c28936t3 = c28907l.f58783j;
        KProperty kProperty3 = kPropertyArr[4];
        c28936t3.f58834a.set(c28936t3.f58835b, nfcReadController$ReadingStep);
        c28907l.f58785l = C41696j.m91104d(c28907l.f58774a, null, null, new C28904i(c28907l, isoDep, null), 3, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m69684a(NfcAdapter nfcAdapter) {
        NfcAdapter nfcAdapter2 = this.f58793l;
        if (nfcAdapter2 == nfcAdapter) {
            return;
        }
        if (nfcAdapter2 != null) {
            try {
                nfcAdapter2.disableReaderMode(this.f58549a.requireActivity());
                m69608b("Stopped NFC listening.");
            } catch (Exception e11) {
                m69606a("Failed to stop NFC listening.", e11);
            }
        }
        if (nfcAdapter != null) {
            try {
                nfcAdapter.enableReaderMode(this.f58549a.requireActivity(), this.f58792k, this.f58790i, this.f58791j);
                m69608b("Started NFC listening.");
            } catch (Exception e12) {
                m69606a("Failed to start NFC listening.", e12);
            }
        }
        this.f58793l = nfcAdapter;
    }

    /* JADX INFO: renamed from: a */
    public final void m69685a(boolean z11) {
        if (this.f58794m == z11) {
            return;
        }
        m69608b("NFC should listen: " + z11);
        this.f58794m = z11;
        m69686n();
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m69681a(C28908m c28908m, InterfaceC28898c interfaceC28898c) {
        c28908m.m69685a((interfaceC28898c instanceof C28901f) || (interfaceC28898c instanceof C28902g));
        return Unit.INSTANCE;
    }
}
