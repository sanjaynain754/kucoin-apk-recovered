package kf0;

import android.text.style.StrikethroughSpan;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.upstream.CmcdData;
import cf0.C4952g;
import cf0.C4965t;
import cf0.InterfaceC4957l;
import cf0.InterfaceC4964s;
import gf0.AbstractC37912j;
import gf0.AbstractC37915m;
import gf0.InterfaceC37908f;
import java.util.Arrays;
import java.util.Collection;
import org.commonmark.ext.gfm.strikethrough.Strikethrough;

/* JADX INFO: renamed from: kf0.i */
/* JADX INFO: compiled from: StrikeHandler.java */
/* JADX INFO: loaded from: classes60.dex */
public class C41025i extends AbstractC37915m {

    /* JADX INFO: renamed from: a */
    public static final boolean f91254a;

    static {
        boolean z11;
        try {
            Class.forName("org.commonmark.ext.gfm.strikethrough.Strikethrough");
            z11 = true;
        } catch (Throwable unused) {
            z11 = false;
        }
        f91254a = z11;
    }

    @Override // gf0.AbstractC37915m
    @NonNull
    /* JADX INFO: renamed from: b */
    public Collection<String> mo85735b() {
        return Arrays.asList(CmcdData.Factory.STREAMING_FORMAT_SS, "del");
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static Object m89978d(@NonNull InterfaceC4957l interfaceC4957l) {
        C4952g c4952gMo5202o = interfaceC4957l.mo5202o();
        InterfaceC4964s interfaceC4964s = c4952gMo5202o.m5180c().get(Strikethrough.class);
        if (interfaceC4964s == null) {
            return null;
        }
        return interfaceC4964s.mo5246a(c4952gMo5202o, interfaceC4957l.mo5200h());
    }

    @Override // gf0.AbstractC37915m
    /* JADX INFO: renamed from: a */
    public void mo85734a(@NonNull InterfaceC4957l interfaceC4957l, @NonNull AbstractC37912j abstractC37912j, @NonNull InterfaceC37908f interfaceC37908f) {
        Object strikethroughSpan;
        if (interfaceC37908f.mo85698e()) {
            AbstractC37915m.m85733c(interfaceC4957l, abstractC37912j, interfaceC37908f.mo85695a());
        }
        C4965t c4965tBuilder = interfaceC4957l.builder();
        if (f91254a) {
            strikethroughSpan = m89978d(interfaceC4957l);
        } else {
            strikethroughSpan = new StrikethroughSpan();
        }
        C4965t.m5248j(c4965tBuilder, strikethroughSpan, interfaceC37908f.start(), interfaceC37908f.mo85697c());
    }
}
