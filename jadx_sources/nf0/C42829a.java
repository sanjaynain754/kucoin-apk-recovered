package nf0;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import androidx.annotation.NonNull;
import androidx.core.text.util.LinkifyCompat;
import cf0.AbstractC4946a;
import cf0.C4965t;
import cf0.InterfaceC4954i;
import cf0.InterfaceC4957l;
import cf0.InterfaceC4962q;
import cf0.InterfaceC4964s;
import ih0.C38633o;
import io.noties.markwon.core.C39137a;
import io.noties.markwon.core.CoreProps;

/* JADX INFO: renamed from: nf0.a */
/* JADX INFO: compiled from: LinkifyPlugin.java */
/* JADX INFO: loaded from: classes60.dex */
public class C42829a extends AbstractC4946a {

    /* JADX INFO: renamed from: a */
    public final int f94888a;

    /* JADX INFO: renamed from: b */
    public final boolean f94889b;

    /* JADX INFO: renamed from: nf0.a$a */
    /* JADX INFO: compiled from: LinkifyPlugin.java */
    public class a implements InterfaceC4954i.a<C39137a> {
        public a() {
        }

        @Override // cf0.InterfaceC4954i.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(@NonNull C39137a c39137a) {
            c39137a.m87824d(C42829a.this.f94889b ? new b(C42829a.this.f94888a) : new c(C42829a.this.f94888a));
        }
    }

    /* JADX INFO: renamed from: nf0.a$b */
    /* JADX INFO: compiled from: LinkifyPlugin.java */
    public static class b extends c {
        public b(int i11) {
            super(i11);
        }

        @Override // nf0.C42829a.c
        /* JADX INFO: renamed from: b */
        public boolean mo93922b(@NonNull Spannable spannable, int i11) {
            return LinkifyCompat.addLinks(spannable, i11);
        }
    }

    /* JADX INFO: renamed from: nf0.a$c */
    /* JADX INFO: compiled from: LinkifyPlugin.java */
    public static class c implements C39137a.p {

        /* JADX INFO: renamed from: a */
        public final int f94891a;

        public c(int i11) {
            this.f94891a = i11;
        }

        @Override // io.noties.markwon.core.C39137a.p
        /* JADX INFO: renamed from: a */
        public void mo87841a(@NonNull InterfaceC4957l interfaceC4957l, @NonNull String str, int i11) {
            InterfaceC4964s interfaceC4964s = interfaceC4957l.mo5202o().m5180c().get(C38633o.class);
            if (interfaceC4964s != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                if (mo93922b(spannableStringBuilder, this.f94891a)) {
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    if (uRLSpanArr != null && uRLSpanArr.length > 0) {
                        InterfaceC4962q interfaceC4962qMo5200h = interfaceC4957l.mo5200h();
                        C4965t c4965tBuilder = interfaceC4957l.builder();
                        for (URLSpan uRLSpan : uRLSpanArr) {
                            CoreProps.f87003e.m5239d(interfaceC4962qMo5200h, uRLSpan.getURL());
                            C4965t.m5248j(c4965tBuilder, interfaceC4964s.mo5246a(interfaceC4957l.mo5202o(), interfaceC4962qMo5200h), spannableStringBuilder.getSpanStart(uRLSpan) + i11, spannableStringBuilder.getSpanEnd(uRLSpan) + i11);
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public boolean mo93922b(@NonNull Spannable spannable, int i11) {
            return Linkify.addLinks(spannable, i11);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C42829a m93920c(int i11) {
        return new C42829a(i11, false);
    }

    @Override // cf0.AbstractC4946a, cf0.InterfaceC4954i
    public void configure(@NonNull InterfaceC4954i.b bVar) {
        bVar.mo5194a(C39137a.class, new a());
    }

    public C42829a(int i11, boolean z11) {
        this.f94888a = i11;
        this.f94889b = z11;
    }
}
