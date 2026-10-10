package kf0;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.upstream.CmcdData;
import cf0.C4952g;
import cf0.InterfaceC4962q;
import cf0.InterfaceC4964s;
import gf0.InterfaceC37908f;
import ih0.C38633o;
import io.noties.markwon.core.CoreProps;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: renamed from: kf0.f */
/* JADX INFO: compiled from: LinkHandler.java */
/* JADX INFO: loaded from: classes60.dex */
public class C41022f extends AbstractC41024h {
    @Override // gf0.AbstractC37915m
    @NonNull
    /* JADX INFO: renamed from: b */
    public Collection<String> mo85735b() {
        return Collections.singleton(CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY);
    }

    @Override // kf0.AbstractC41024h
    @Nullable
    /* JADX INFO: renamed from: d */
    public Object mo89974d(@NonNull C4952g c4952g, @NonNull InterfaceC4962q interfaceC4962q, @NonNull InterfaceC37908f interfaceC37908f) {
        InterfaceC4964s interfaceC4964s;
        String str = interfaceC37908f.mo85696b().get("href");
        if (!TextUtils.isEmpty(str) && (interfaceC4964s = c4952g.m5180c().get(C38633o.class)) != null) {
            CoreProps.f87003e.m5239d(interfaceC4962q, str);
            return interfaceC4964s.mo5246a(c4952g, interfaceC4962q);
        }
        return null;
    }
}
