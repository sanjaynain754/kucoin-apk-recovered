package kf0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import cf0.C4952g;
import cf0.InterfaceC4962q;
import com.facebook.AuthenticationTokenClaims;
import gf0.InterfaceC37908f;
import java.util.Collection;
import java.util.Collections;
import jf0.C40400a;

/* JADX INFO: renamed from: kf0.k */
/* JADX INFO: compiled from: SubScriptHandler.java */
/* JADX INFO: loaded from: classes60.dex */
public class C41027k extends AbstractC41024h {
    @Override // gf0.AbstractC37915m
    @NonNull
    /* JADX INFO: renamed from: b */
    public Collection<String> mo85735b() {
        return Collections.singleton(AuthenticationTokenClaims.JSON_KEY_SUB);
    }

    @Override // kf0.AbstractC41024h
    @Nullable
    /* JADX INFO: renamed from: d */
    public Object mo89974d(@NonNull C4952g c4952g, @NonNull InterfaceC4962q interfaceC4962q, @NonNull InterfaceC37908f interfaceC37908f) {
        return new C40400a();
    }
}
