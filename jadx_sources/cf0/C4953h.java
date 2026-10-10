package cf0;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ih0.AbstractC38637s;
import java.util.Iterator;
import java.util.List;
import jh0.C40408d;

/* JADX INFO: renamed from: cf0.h */
/* JADX INFO: compiled from: MarkwonImpl.java */
/* JADX INFO: loaded from: classes60.dex */
public class C4953h extends AbstractC4950e {

    /* JADX INFO: renamed from: a */
    public final TextView.BufferType f5520a;

    /* JADX INFO: renamed from: b */
    public final C40408d f5521b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4958m f5522c;

    /* JADX INFO: renamed from: d */
    public final C4952g f5523d;

    /* JADX INFO: renamed from: e */
    public final List<InterfaceC4954i> f5524e;

    /* JADX INFO: renamed from: f */
    public final boolean f5525f;

    @NonNull
    /* JADX INFO: renamed from: c */
    public AbstractC38637s m5192c(@NonNull String str) {
        Iterator<InterfaceC4954i> it = this.f5524e.iterator();
        while (it.hasNext()) {
            str = it.next().processMarkdown(str);
        }
        return this.f5521b.m89041b(str);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public Spanned m5193d(@NonNull AbstractC38637s abstractC38637s) {
        Iterator<InterfaceC4954i> it = this.f5524e.iterator();
        while (it.hasNext()) {
            it.next().beforeRender(abstractC38637s);
        }
        InterfaceC4957l interfaceC4957lMo5211a = this.f5522c.mo5211a();
        abstractC38637s.mo87323a(interfaceC4957lMo5211a);
        Iterator<InterfaceC4954i> it2 = this.f5524e.iterator();
        while (it2.hasNext()) {
            it2.next().afterRender(abstractC38637s, interfaceC4957lMo5211a);
        }
        return interfaceC4957lMo5211a.builder().m5258l();
    }

    public C4953h(@NonNull TextView.BufferType bufferType, @Nullable AbstractC4950e.b bVar, @NonNull C40408d c40408d, @NonNull AbstractC4958m abstractC4958m, @NonNull C4952g c4952g, @NonNull List<InterfaceC4954i> list, boolean z11) {
        this.f5520a = bufferType;
        this.f5521b = c40408d;
        this.f5522c = abstractC4958m;
        this.f5523d = c4952g;
        this.f5524e = list;
        this.f5525f = z11;
    }

    @Override // cf0.AbstractC4950e
    @NonNull
    /* JADX INFO: renamed from: b */
    public Spanned mo5175b(@NonNull String str) {
        Spanned spannedM5193d = m5193d(m5192c(str));
        if (TextUtils.isEmpty(spannedM5193d) && this.f5525f && !TextUtils.isEmpty(str)) {
            return new SpannableStringBuilder(str);
        }
        return spannedM5193d;
    }
}
